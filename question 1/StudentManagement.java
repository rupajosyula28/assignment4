// Custom Exception 1: AgeNotWithinRangeException
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception 2: NameNotValidException
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;

        // Age validation
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age " + age + " is not within the allowed range (15-21)");
        }
        this.age = age;

        // Name validation using regex
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name '" + name + "' is not valid. It should not contain numbers or special characters.");
        }
        this.name = name;
    }

    // Display student info
    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

// Main class to test the code
public class StudentManagement {
    public static void main(String[] args) {
        try {
            // Valid student
            Student s1 = new Student(101, "Ramesh Kumar", 18, "BCA");
            s1.displayInfo();

            // Invalid name
            Student s2 = new Student(102, "R4mesh", 19, "BSc");

            // Invalid age
            Student s3 = new Student(103, "Anita", 23, "BCom");

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
