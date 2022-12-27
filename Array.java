public class Array {
public static void main(String args[])
{
	int a[] = {2,5,4,1,3};
	int i,max = a[0],min = a[0],sum = 0;
	for(i=0; i<a.length;i++)
	{
    if(a[i] > max)
max = a[i];
if(a[i] < min)
min = a[i];
sum = sum + a[i];
	}
	System.out.println("The minimum element is" +min);
	System.out.println("The maximum elements is" +max);
	System.out.println("The sum of all the elememts is" +sum);
}
}
