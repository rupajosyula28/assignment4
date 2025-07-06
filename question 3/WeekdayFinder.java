import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Step 1: Define array of weekdays
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Step 2: Get day index from user
            System.out.print("Enter day index (0 for Sunday, 6 for Saturday): ");
            int index = scanner.nextInt();

            // Step 3: Print the corresponding weekday
            System.out.println("Day is: " + days[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
