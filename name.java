import java.io.*;
import java.lang.*;
public class name {
public static void main() throws IOException {
{
String city[] = {"Banglore","Agra","Mumbai","Kolkata"};
String temp;
int i,j,n=5;
for (i=1;i<=n-1;i++)
{
for (j=0;j<=n-1;j++)
{
if((city[j].compareTo(city[j+1]))>0)
{
temp=city[j];
city[j]=city[j+1];
city[j+1]= temp;
}
}
}
for(int k = 0; k< n;k++)
{
System.out.println(city[k]);			
}
}
}
}