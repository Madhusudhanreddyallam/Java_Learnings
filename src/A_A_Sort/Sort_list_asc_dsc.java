package A_A_Sort;

import java.util.*;


public class Sort_list_asc_dsc {

	
	    public static void main(String[] args)
	    {
	        List<Integer> al = new ArrayList<Integer> () ;
	        al.add(2);
	        al.add(1);
	        al.add(3);
	     
	        Collections.sort(al);
	        System.out.println(al); //ascending
	        
	        Collections.reverse(al);System.out.println(al); // reverse the list which is sorted ascending the it becomes descending
	        
	        Collections.sort(al, (al1,al2) -> al1.compareTo(al2)); //ascending
	        System.out.println(al);
	        
	        Collections.sort(al, (al1,al2) -> al2.compareTo(al1)); //descending
	        System.out.println(al);
	    }	
		
	
		
	} 

