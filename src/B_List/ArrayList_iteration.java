package B_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_iteration {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();

		alist.add("Madhusudhan");
		alist.add("Reddy");
		alist.add(" Allam");

		//Iterate a List
		
		//1.using foreach method
		alist.forEach(a -> System.out.print(a));
		
		//2.using iterator
		System.out.println();		
		Iterator it = alist.iterator();		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		//3.for loop
		System.out.println();	
		for(int i=0; i<alist.size();i++)
		{
			System.out.print(alist.get(i));
		}
		
		//4.for each loop
		System.out.println();
		for(String a : alist)
		{
			System.out.print(a);
		}
	}

}
