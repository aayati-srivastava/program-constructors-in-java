import java.util.Scanner;
public class Area
{
public static void main(String[] args)
{
double base, height , area_cm , area_inch;
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of base of triangle in cm:");
base = input.nextDouble();
System.out.print("Enter the value of height of triangle in cm:");
height = input.nextDouble();
area_cm = (1/2.0) * base * height;
area_inch = area_cm * 0.155;
System.out.println("The area of triangle in centimeters is:" + area_cm);
System.out.println("The area of triangle in inches is:" + area_inch);
input.close();
}
}
