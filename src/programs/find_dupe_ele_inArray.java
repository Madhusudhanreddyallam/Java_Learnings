package programs;

import java.util.HashSet;

public class find_dupe_ele_inArray {
	
	public static void main(String [] args)
	{
		String firms[] = {"Amazon", "UST" , "Accenture" , "UST" , "Google" , "accenture"};
		
		HashSet<String> dup = new HashSet<String>();
		for (String e : firms)
		{
			if(dup.add(e.toLowerCase())== false)
			{
				System.out.println(e);
			}
				
		}
		
		
	}

}
