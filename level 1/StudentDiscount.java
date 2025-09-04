import java.util.Scanner;
public class StudentDiscount
{
public static void main(String[] args)
{
double fee, discount_percent;
double discount, fee_to_pay;
Scanner input = new Scanner(System.in);
System.out.print("Enter the fee:");
fee = input.nextDouble();
System.out.print("Enter the discount percent:");
discount_percent = input.nextDouble();
discount = (discount_percent / 100)*fee;
fee_to_pay = fee - discount;
System.out.println("The Fee which you have to pay is:" + fee_to_pay);
input.close();
}
}