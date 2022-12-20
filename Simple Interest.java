import java.util.Scanner;
public class SimpleInterestProgram {
public static void main(String[] args) {
				float principle,rate,time,simpleinterest;
				System.out.println("Required package have been imported");
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a principle number:");
				principle = sc. nextInt();
				System.out.println("Enter a Interest rate:");
				rate = sc . nextInt();
				System.out.println("Enter a time period in years:");
				time = sc. nextInt();
				simpleinterest = (principle*rate*time)/100;
					System.out.println("The simple Interest is :  "+simpleinterest);
			}
	}
