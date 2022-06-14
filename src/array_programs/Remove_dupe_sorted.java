package array_programs;

import java.util.Arrays;

public class Remove_dupe_sorted {
	
	public static int[] remove_dupe(int[] a)
	{
		//Sort an array in ascending order
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length ; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("sorted Array with dupe: " + Arrays.toString(a));
		
		// find the duplicate value and increase j
		int j=0;		
		for(int i=0; i<a.length-1;i++)
		{
			if(a[i]==a[i+1]) 
			{
				++j;
			}
		} System.out.println("no of duplicates present in the array : " + j);
		
		//Create new array and send the unique elements
		int[] final_arr = new int[a.length-j];
		int k =0;		
		for(int i=0 ; i< a.length-1 ; i++)
		{
			if(a[i] != a[i+1])
			{
				final_arr[k++] = a[i];
			}
		} final_arr[k++] = a[a.length-1]; //sending the last unique value after forloop
		
		return final_arr; 
	}
	
	
	public static void main(String[] args)
	{		
		int[] a = { 1 , 5, 7 ,9 ,5 , 2, 2, 9 , 9 , 9 };
		int[] std_arr = remove_dupe(a);
		System.out.println("Final array after cleaning dupes " + Arrays.toString(std_arr));
	}  

}
