package a_String;

import java.util.HashSet;
import java.util.Set;

public class string_comptression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abbcdeeeeee";
		String temp = "";
        Set<Character> set = new HashSet<Character>();
        for(char c : s.toCharArray())
        {
        	
        	if(set.add(c)==true)
        		temp += c;
        }
      
        System.out.println(temp);
	}

}
