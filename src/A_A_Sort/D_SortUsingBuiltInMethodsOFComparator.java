package A_A_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Override;

public class D_SortUsingBuiltInMethodsOFComparator {
	public static void main(String[] args) {
		List<Movies> cinemas = new ArrayList<Movies>();
		cinemas.add(new Movies("MovieA", 8, 2010));
		cinemas.add(new Movies("MovieB", 7, 2015));
		cinemas.add(new Movies("MovieA", 7, 2012));

		//Approach 1
		Collections.sort(cinemas, Comparator.comparing(Movies::getName)
				                            .thenComparingInt(Movies::getRating));
		//Approach 2
		/*Collections.sort(cinemas,(c1,c2)-> 
		    (c1.getName().compareTo(c2.getName())> 0)?  1:
			(c1.getName().compareTo(c2.getName())< 0)? -1: 
			 c1.getRating() - c2.getRating() ); */ 
		

		for (Movies cinema : cinemas) {
			System.out.println(cinema.getName() + " - Release Year: " + cinema.getReleaseYear() + ", Rating: " + cinema.getRating());
		}
	}
}



