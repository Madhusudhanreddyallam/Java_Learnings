package Hasmap;

import java.util.HashMap;

public class MR_MRS {

	
	public static void main(String[] args) {
  
		 String a[] = { "MR.madhu" , "MR.bharath" , "MRS.Suma"};
		 
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
		 for (String s : a)
		 {
		    s = s.substring(0,s.indexOf("."));
		    if(hm.containsKey(s))
		    	hm.put(s, hm.get(s)+1);
		    else
		    	hm.put(s, 1);
		 }
		 
		 hm.forEach((k,v) -> System.out.println("key " + k + " value " + v));

	}

}
