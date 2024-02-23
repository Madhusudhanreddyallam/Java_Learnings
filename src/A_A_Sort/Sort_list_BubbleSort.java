package A_A_Sort;

import java.util.*;


public class Sort_list_BubbleSort {

	
	    public static void main(String[] args)
	    {
	        List<Integer> al = new ArrayList<Integer> () ;
	        al.add(2);
	        al.add(3);
	        al.add(4);
	        sortList(al);
	        Collections.sort(al);
	        System.out.println(al); //ascending
	        
	        Collections.reverse(al);System.out.println(al); // reverse the list which is sorted ascending the it becomes descending
	        
	        Collections.sort(al, (al1,al2) -> al1.compareTo(al2)); //ascending
	        System.out.println(al);
	        
	        Collections.sort(al, (al1,al2) -> al2.compareTo(al1)); //descending
	        System.out.println(al);
	    }	
		
	    
	    public static void sortList(List<Integer> elements) {
	    	int temp;
	    	boolean swapping;
	    	int len = elements.size();
	    	do {
	    		swapping = false;
	    		for(int i=1 ; i<len ; i++) {
	    			if(elements.get(i-1) < elements.get(i)) { 
	    				temp = elements.get(i-1);
	    				elements.set(i-1, elements.get(i));
	    				elements.set(i, temp);
	    				swapping = true;
	    			}     
	    		} len--;
	    	}while(swapping) ; System.out.println("elements = " + elements);
	    }
	
		
	} 

