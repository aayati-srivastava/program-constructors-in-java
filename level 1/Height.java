import java.util.Scanner;
public class Height
{
public static void main(String[] args)
{
double cm,feet,inch;
Scanner input=new Scanner(System.in);
System.out.print("enter your height in cm");
cm=input.nextDouble();
inch=cm/2.54;
foot=inch/12;
System.out.println("your height in cm is"+cm);
System.out.println("while in feet is"+feet);
System.out.println("and inches is"+inch);
input.close();
}
}