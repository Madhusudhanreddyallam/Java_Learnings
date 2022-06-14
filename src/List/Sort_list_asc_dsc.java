package List;

import java.util.*;


public class Sort_list_asc_dsc {

	
	    public static void main(String[] args)
	    {
	        List<Integer> al = new LinkedList<Integer> () ;
	        al.add(3);
	        al.add(1);
	        al.add(2);
	        
	        Collections.sort(al, (al1,al2) -> al1.compareTo(al2)); //ascending
	        System.out.println(al);
	        
	        Collections.sort(al, (al1,al2) -> al2.compareTo(al1)); //descending
	        System.out.println(al);
	    }	
		
	
		
	} 

