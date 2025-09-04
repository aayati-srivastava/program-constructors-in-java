import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get salary input from the user
        System.out.print("Enter your salary (INR): ");
        double salary = scanner.nextDouble();

        // Get bonus input from the user
        System.out.print("Enter your bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);

        // Close the scanner
        scanner.close();
    }
}
