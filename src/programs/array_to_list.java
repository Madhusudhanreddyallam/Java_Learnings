package programs;

import java.util.ArrayList;

public class array_to_list {
	
	public static void main (String[] args)
	{
		String array[] = { "Geeks", "forGeeks", "A Computer Portal" };
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		for(String a : array)
		{
			list.add(a);
			
		}
		System.out.println(list);
	}

}
