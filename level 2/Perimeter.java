import java.util.Scanner;
public class Perimeter
{
public static void main(String[] args)
{
double perimeter , side;
Scanner input = new Scanner(System.in);

System.out.print("Enter the perimeter of the square:");
perimeter = input.nextDouble();
side = perimeter/4.0;
System.out.println("The side of the square is:" + side);
input.close();
}
}