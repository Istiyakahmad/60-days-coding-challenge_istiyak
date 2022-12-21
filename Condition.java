import java.util.Scanner;
public class Condition {
public static void main(String args[]) {
int age;
System.out.println("Enter your age:");
Scanner sc = new Scanner (System.in);
age = sc.nextInt();
if (age >=15) {
	System.out.println ("you can attend the board exam");
}
else
{
	System.out.println ("you can not attend the board exam");
	}
}
}