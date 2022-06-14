package array_programs;

import java.util.Arrays;

public class high_prodcut_of_2num {

	public static void function(int[] arr , int length)
	{
		if(length < 2)
		{
			System.out.println("Invalid input");
			return;
		}
			
		if(length == 2)
		{
			System.out.println("Max product pair is : " + arr[0] + " , "+ arr[1]);
			return;
		}
					
		Arrays.sort(arr);			
		if ((arr[0]*arr[1]) > (arr[length-1]*arr[length-2]))
			System.out.println("Max product pair is : " + arr[0] + " , "+ arr[1]);
		else
			System.out.println("Max product pair is : " + arr[length-2] + " , "+ arr[length-1]);
	}
	  public static void main (String args[])
	  {
		  int array[] = {-20};
		  function(array , array.length);
	  } 
	  
	  
	  public class Solution {  // LeetCode
		    public int maximumProduct(int[] nums) {
		        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		        for (int n: nums) {
		            if (n <= min1) {
		                min2 = min1;
		                min1 = n;
		            } else if (n <= min2) {     // n lies between min1 and min2
		                min2 = n;
		            }
		            if (n >= max1) {            // n is greater than max1, max2 and max3
		                max3 = max2;
		                max2 = max1;
		                max1 = n;
		            } else if (n >= max2) {     // n lies betweeen max1 and max2
		                max3 = max2;
		                max2 = n;
		            } else if (n >= max3) {     // n lies betwen max2 and max3
		                max3 = n;
		            }
		        }
		        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
		    }
		}
	  
	  
	  
	}


//Geeks for Geeks

class GFG{
	
//Function to find a maximum product of
//a triplet in array of integers of size n
static int maxProduct(int []arr, int n)
{
	
	// If size is less than 3, no triplet exists
	if (n < 3)
		return -1;

	// Initialize Maximum, second maximum
	// and third maximum element
	int maxA = Integer.MIN_VALUE,
		maxB = Integer.MIN_VALUE,
		maxC = Integer.MIN_VALUE;

	// Initialize Minimum and
	// second mimimum element
	int minA = Integer.MAX_VALUE,
		minB = Integer.MAX_VALUE;

	for(int i = 0; i < n; i++)
	{
		
		// Update Maximum, second maximum
		// and third maximum element
		if (arr[i] > maxA)
		{
			maxC = maxB;
			maxB = maxA;
			maxA = arr[i];
		}

		// Update second maximum and
		// third maximum element
		else if (arr[i] > maxB)
		{
			maxC = maxB;
			maxB = arr[i];
		}

		// Update third maximum element
		else if (arr[i] > maxC)
			maxC = arr[i];

		// Update Minimum and second
		// mimimum element
		if (arr[i] < minA)
		{
			minB = minA;
			minA = arr[i];
		}

		// Update second mimimum element
		else if(arr[i] < minB)
			minB = arr[i];
	}

	return Math.max(minA * minB * maxA,
					maxA * maxB * maxC);
}

//Driver code
public static void main(String[] args)
{
	int []arr = { 1, -4, 3, -6, 7, 0 };
	int n = arr.length;

	int max = maxProduct(arr, n);

	if (max == -1)
		System.out.print("No Triplet Exists");
	else
		System.out.print("Maximum product is " + max);
}
}




