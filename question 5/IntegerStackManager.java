import java.util.Scanner;
import java.util.Stack;

public class IntegerStackManager {
    Stack<Integer> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);

    // a. Push element onto stack
    public void pushElement() {
        System.out.print("Enter an integer to push onto the stack: ");
        int num = scanner.nextInt();
        stack.push(num);
        System.out.println(num + " pushed onto the stack.\n");
    }

    // b. Pop element from stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            System.out.println("Popped element: " + popped + "\n");
        } else {
            System.out.println("Stack is empty. Nothing to pop.\n");
        }
    }

    // c. Check if stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.\n");
        } else {
            System.out.println("Stack is not empty.\n");
        }
    }

    // Menu to perform operations
    public void showMenu() {
        int choice;
        do {
            System.out.println("=== Stack Operations Menu ===");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> pushElement();
                case 2 -> popElement();
                case 3 -> checkIfEmpty();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.\n");
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void main(String[] args) {
        IntegerStackManager manager = new IntegerStackManager();
        manager.showMenu();
    }
}
