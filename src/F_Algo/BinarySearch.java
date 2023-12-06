package F_Algo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5,6,7,8};
		int target = 8;
		System.out.println(binarySearch(arr , target));
		
	}
	
	public static int binarySearch(int[] arr , int target)
	{

		int left = 0;
		int right = arr.length-1;
		
		while (left<=right)
		{			
			int middle = (left+right)/2;
			
			if(arr[middle] == target)
				return middle;
			
			else if (target > arr[middle])
			{
				left = middle + 1;
			}
			else
				right = middle - 1;
		} 
		return 0;
		
	}

}
