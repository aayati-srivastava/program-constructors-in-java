import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        // Conversion factor: 1 pound = 2.2 kilograms
        double kilograms = pounds * 2.2;

        // Display the result
        System.out.printf("Weight in kilograms: %.2f kg%n", kilograms);

        // Close the scanner
        sc.close();
    }
}
