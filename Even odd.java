package batch1;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[])
	{
int n;
System.out.println("Enter any number");
Scanner reader = new Scanner(System.in);
int num= reader.nextInt();
if(num%2==0)
{
	System.out.println("Even number");
    }
else
{
	System.out.println("Odd number");
}
}
}