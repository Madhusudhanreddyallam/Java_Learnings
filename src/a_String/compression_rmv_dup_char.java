package a_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class compression_rmv_dup_char {
	
	public static void main(String[] args)
	{
		String str = "AADABBYBBCYC";
		int len = str.length();
		
		System.out.println(dupe_remove(str,len));
		dupe_remove_map(str,len);
		 
		dupe_remove_char(str);
	}
	
	public static String dupe_remove(String word , int len)
	{
		
        String temp = "";
		int i=0;
		while(i<len)
		{
			if(temp.indexOf(word.charAt(i))== -1)
				temp += word.charAt(i);
			i++;
		} return temp;
		
	}
	
	public static void dupe_remove_map(String word , int len)
	{
		
        Map<Character , Integer> hm = new HashMap<Character , Integer>();
        
        for(int i=0 ; i<len ; i++)
        {
        	if(!hm.containsKey(word.charAt(i)))
        	{
        		hm.put(word.charAt(i), 1);
        		System.out.print(word.charAt(i));
        	}
        	
        		
        }
	}
	
	public static void dupe_remove_char(String word )
	{
		
        char[] ch =  word.toCharArray();
        Arrays.sort(ch);
        String temp = "";
        
        for(int i=0; i<ch.length;i++)
        {
        	if(i==ch.length-1)
        	{
        		temp+=ch[i];
        		break;
        	}
        	
        	if(ch[i]!=ch[i+1])
        		temp+=ch[i];
        		
        }System.out.println();
        System.out.println(temp);
	}

}
