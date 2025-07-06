import java.util.Scanner;

// Custom Checked Exception
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
    }
}

// Main class with Scanner
public class VoterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from user
            System.out.print("Enter Voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            // Create Voter object
            Voter voter = new Voter(voterId, name, age);
            System.out.println("\nVoter Details:");
            voter.display();

        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
