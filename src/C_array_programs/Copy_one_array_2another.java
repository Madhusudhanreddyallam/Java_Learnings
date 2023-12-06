package C_array_programs;

import java.util.Arrays;

public class Copy_one_array_2another {
	
	public static void main(String[] args) // This is the correct method to copy from one array to another because assigning b = a will just assigns reference
	{
		int[] a = {1, 4 , 7, 10};		
		int[] b = new int[a.length];
				
		for(int i = 0; i<a.length ; i++)
			b[i] = a[i] ;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//Using_Clone();
	}

	
	public static void Using_Clone() // This is the correct method to copy from one array to another because assigning b = a will just assigns reference
	{
		int[] a = {1, 4 , 7, 10};		
		int[] b = a.clone();
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
