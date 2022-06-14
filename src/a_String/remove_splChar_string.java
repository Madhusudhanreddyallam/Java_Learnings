package a_String;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_splChar_string {

	public static void main(String[] args)
	{	
		String str= "Bread$$##12.5$$##10 ";   
		str = str.replaceAll("[^a-zA-Z0-9^.]", " ");  
		System.out.println(str); 
		
		String arr[] = str.split("    ");
		
		for(int i = 0 ; i<arr.length ; i++)
			System.out.println(arr[i]);

	}
   
  }



