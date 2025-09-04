import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input value for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes is: " + handshakes);

        // Close the scanner
        sc.close();
    }
}
