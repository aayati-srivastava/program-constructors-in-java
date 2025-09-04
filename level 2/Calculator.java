import java.util.Scanner;
public class Calculator
{
public static void main(String[] args)
{
double num1 , num2 , add , sub , multi , div;
Scanner input = new Scanner(System.in);
System.out.print("Enter first number:");
num1 = input.nextDouble();
System.out.print("Enter second number:");
num2 = input.nextDouble();
add = num1 + num2;
sub = num1 - num2;
multi = num1 * num2;
div = num1 / num2;
System.out.println("The result is:" + add + "," + sub + "," + multi + "," + div);
input.close();
}
}