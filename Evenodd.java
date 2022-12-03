import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args){

	int n;

	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    if(n%2==0){
    System.out.println("Even");

    }
    else{
    System.out.println("odd number");
    }
	}
}