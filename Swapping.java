import java.util.Scanner;
import java.lang.String;
class Swapping
{
public static void main(String[] args)
{
int a,b;
System.out.println("Enter two numbers - ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
int c = a;
a=b;
b=c;
System.out.println("After swapping a is "+a+" and b is "+b);
}
}  