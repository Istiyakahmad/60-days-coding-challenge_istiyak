import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
int age;
System.out.println("Enter your age");
 Scanner sc= new Scanner (System.in);
age = sc.nextInt();
switch(age){
case 18:
System.out.println("You are going to become on adult");
break;
case 23:
System.out.println("You are going to get a job");
break;
case 60:
System.out.println("You are going to get retired");
break;
default:
System.out.println("Enjoy your life");
}
}
}