import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Taking user input for fee and discount percentage
        System.out.print("Enter the travel fee (INR): ");
        int fee = scanner.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discountPercent = scanner.nextInt();

        // Calculating final fee after discount
        int discountAmount = (fee * discountPercent) / 100;
        int finalFee = fee - discountAmount;

        // Printing the results
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + (fromToVia + viaToFinalCity) + " miles");
        System.out.println("Total Time Taken: " + timeTaken + " hours");
        System.out.println("The results of Int Operations are " + fee + ", " + discountAmount + ", and " + finalFee);

        // Close the scanner
        scanner.close();
    }
}
