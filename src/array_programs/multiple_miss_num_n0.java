package array_programs;

import java.util.Arrays;

public class multiple_miss_num_n0 {
	
	public static void printMissingElements(int arr[], int N)
	  {
		Arrays.sort(arr);
	    int cnt = 0;
	    for (int i = arr[0]; i < arr[N-1]; i++)
	    {
	      if (arr[cnt] == i)
	      {
	        cnt++;
	      }
	      else
	      {
	        System.out.print(i + " ");
	      }
	    }
	  }
	 
	  // Driver Code
	  public static void main (String[] args)
	  {
	 
	    int arr[] = { 6, 7, 10, 13 ,11 };
	    int N = arr.length;
	    printMissingElements(arr, N);
	  }

}
