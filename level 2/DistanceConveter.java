import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Converting distance
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        // Getting height in cm
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Converting height
        double heightInInches = heightInCm / 2.54;
        int heightInFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        System.out.println("Your Height in cm is " + heightInCm + 
                           " while in feet is " + heightInFeet + 
                           " and inches is " + String.format("%.2f", remainingInches));

        scanner.close();
    }
}
