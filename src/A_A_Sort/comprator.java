package A_A_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comprator {

	 public static void main(String[] args) {	 
     /*  So, in essence, the compare method is not explicitly called by you in  line no 25; instead, 
		 it is called internally by the Collections.sort method during the sorting process. 
		 This is part of the contract defined by the Comparator interface in Java, 
		 where the compare method is responsible for determining the order of two objects. */
		 
	        List<Movies> cinemas = new ArrayList<>();
	        cinemas.add(new Movies("MovieA", 8, 2010));
	        cinemas.add(new Movies("MovieB", 7, 2015));
	        cinemas.add(new Movies("MovieA", 7, 2012));

	        // Create a comparator that first compares by release year and then by rating
	        MoviesComparator comparator = new MoviesComparator ();

	        // Sort the list using the comparator
	        Collections.sort(cinemas, comparator);

	        // Print the sorted list
	        for (Movies cinema : cinemas) {
	            System.out.println(cinema.getName() + " - Release Year: " + cinema.getReleaseYear() + ", Rating: " + cinema.getRating());
	        }
	    }
}

//Approach1 
class MoviesComparator implements Comparator<Movies> {
    @Override
    public int compare(Movies cinema1, Movies cinema2) {
        int movieName = cinema1.getName().compareTo(cinema2.getName()); // First, compare the movie name
        if (movieName != 0) {
            return movieName;
        }
        return Integer.compare(cinema1.getRating(), cinema2.getRating()); // If movie names are the same, compare & sort by rating
    }
}

//Approach2
class SortByNames implements Comparator<Movies>{
	@Override
	public int compare(Movies m1, Movies m2) {
		if(m1.getName().compareTo(m2.getName())>0) {
			return 1;	
		}else if(m1.getName().compareTo(m2.getName())<0) {
			return -1;
		}else {
			return m1.getRating() - m2.getRating();
		}
	}
}

