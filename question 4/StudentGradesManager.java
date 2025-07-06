import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesManager {
    private HashMap<String, Integer> studentGrades = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to add a student
    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // consume newline

        studentGrades.put(name, grade);
        System.out.println("Student added successfully.\n");
    }

    // Method to remove a student
    public void removeStudent() {
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();

        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }

    // Method to display a student's grade
    public void displayGrade() {
        System.out.print("Enter student name to display grade: ");
        String name = scanner.nextLine();

        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name) + "\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }

    // Menu to interact with user
    public void showMenu() {
        int choice;

        do {
            System.out.println("=== Student Grades Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> displayGrade();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.\n");
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void main(String[] args) {
        StudentGradesManager manager = new StudentGradesManager();
        manager.showMenu();
    }
}
