package C_array_programs;

import java.util.Arrays;

public class MissingNumberArray{
	
	public static void printMissingElements(int arr[], int N)
	  {
		Arrays.sort(arr);
	    int index = 0;
	    for (int i = arr[0]; i <= arr[N-1]; i++)
	    {
	      if (arr[index] == i)
	      {
	        index++;
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
	    int arr[] = { 1,2,3,5,4 };
	    int N = arr.length;
	    printMissingElements(arr, N);
	  }

}
