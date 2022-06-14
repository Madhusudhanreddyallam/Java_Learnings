package oops;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practise {
	
	public static Integer countchar(String word , String rep_char)
	
	{
		Pattern pt = Pattern.compile(rep_char);
		Matcher mt = pt.matcher(word);
		
		int i = 0;
		 while(mt.find())
			 i++;
		 
		return i;
					
	}
	
	
	public static void main(String[] args)
	{
		String str = "MadhuAllamMa";
		String rep_str = "0";
	    System.out.println("Letter " + rep_str +" is reapeated "+ countchar(str , rep_str));

	}

}
