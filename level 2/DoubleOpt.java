import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input values for a, b, and c (double type)
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Perform operations while considering operator precedence
        double result1 = a + b * c;  // Multiplication (*) happens first, then addition (+)
        double result2 = a * b + c;  // Multiplication (*) happens first, then addition (+)
        double result3 = c + a / b;  // Division (/) happens first, then addition (+)
        double result4 = a % b + c;  // Modulus (%) happens first, then addition (+)

        // Print results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close the scanner
        sc.close();
    }
}
