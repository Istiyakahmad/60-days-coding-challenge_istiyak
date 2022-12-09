import java.util.Random;
public class Main{
public static void main(String args[])
{
// creating an instance of Random class
Random rand = new Random();
// Generating random integers in range 0 to 99
int int1 = rand.nextInt(100);
int int2 = rand.nextInt(100);
// Printing random integers
System.out.println("Random Integers:> "+int1);
System.out.println("Random Integers:> "+int2);
// Generating Random doubles
double dub1 = rand.nextDouble();
double dub2 = rand.nextDouble();
// Printing random doubles
System.out.println("Random Doubles:> "+dub1);
System.out.println("Random Doubles:> "+dub2);
}
}