import java.util.*;
public class Lis{
	public static int lcs(int arr1[],int arr2[]){
	  int n= arr1.length;
	  int m = arr2.length;
	  //create 2D Array..........
	  int dp[][] = new int[n+1][m+1];

	  for(int i=1;i<n+1;i++){
		  for(int j=1;j<m+1;j++){
			  //same
	  if(arr1[i-1]==arr2[j-1])
		  dp[i][j]=dp[i-1][j-1]+1;
	  // diff...
	  else
		  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		  }
	  }
	   return dp[n][m];
    }
	public static int lis(int arr1[]){
		int n = arr1.length;
      HashSet<Integer> set = new HashSet<>();
	  // store unique elements in hashset....
      for(int i=0;i<n;i++)
    	set.add(arr1[i]);
	// create another array for unique elements.....
	int arr2[]=new int[set.size()];
	  // store hashset in arr2 ....
	  int i=0;
	  for(int num : set){
	     arr2[i]=num;
		 i++;
	  }

     // sort arr2...
     Arrays.sort(arr2);
      return lcs(arr1,arr2);	 
	}
	public static void main(String[] args){
	 int arr1[]={50,3,10,7,40,80};
	 System.out.println(lis(arr1));
	}
}