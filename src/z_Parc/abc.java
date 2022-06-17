package z_Parc;


import java.util.*;
import java.util.Map.Entry;


  public  class abc
    {
       	
    	public static void main(String[] args)
 	   {
    		List<Integer> al = new ArrayList<Integer>();
    		al.add(1);
    		al.add(11);
    		al.add(12);
    		al.add(1);
    		al.add(1);
    		al.add(11);
    		
    		for(int i=0 ; i<al.size() ; i++)
    		{
    			System.out.println(Collections.frequency(al, al.get(i)));
    		}
 	   }
    		
    }
    
   
    	
    