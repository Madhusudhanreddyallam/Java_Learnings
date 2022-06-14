package a_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	
	public static void main(String[] args){        
         
	    String name = "AaAAAAaAAA";
		Pattern p = Pattern.compile("A");//. represents single character  
		Matcher matcher = p.matcher(name);  
		int count = 0;    
            while (matcher.find())   
                count++;     
            if(count==0)    
                System.out.println("No match found.");    
            if(count!=0)
            System.out.println(count);
        }       

}
