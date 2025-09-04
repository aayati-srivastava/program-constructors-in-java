import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Perform operations while understanding operator precedence
        int result1 = a + b * c;  // Multiplication (*) happens first, then addition (+)
        int result2 = a * b + c;  // Multiplication (*) happens first, then addition (+)
        int result3 = c + a / b;  // Division (/) happens first, then addition (+)
        int result4 = a % b + c;  // Modulus (%) happens first, then addition (+)

        // Print results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close the scanner
        sc.close();
    }
}
