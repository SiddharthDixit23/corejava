import java.util.Scanner;
import java.lang.String;
class SumOfTwoNumbers
{
public static void main(String[] args)
{
int a,b;
System.out.println("Enter two numbers - ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
int c = a+b;
System.out.println("Sum of "+a+" and "+b+" is "+c);
}
}  