package A_A_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable{
	public static void main(String[] args) {
		List<movie> sortedByRating = new ArrayList<>();
		sortedByRating.add(new movie("Bhaubali" ,4, 2022 ));
		sortedByRating.add(new movie("Bhaubali2" ,5, 2023 ));
		sortedByRating.add(new movie("Racha" ,1, 2022 ));
		sortedByRating.add(new movie("ab" ,5, 2023 ));
		sortedByRating.add(new movie("cs" ,3, 2022 ));
		
		Collections.sort(sortedByRating);
		
		for(movie m : sortedByRating)
		{
			System.out.println(m.getrating() + " "+ m.getName() + " " + m.getReleaseYear() );
		}
	}
}


class movie implements Comparable<movie> {
	
	private String name;
	private int rating;
	private int releaseYear;
	
	public movie(String name , int rating , int year) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = year;
	}
	
	public String getName() {
		return name;
	}
	
	public int getrating() {
		return rating;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}

	@Override
	public int compareTo(movie obj) {
		int relYear = this.releaseYear - obj.releaseYear ;	 //return 1 if it is greater, -1 if it is less , 0 for equal
		if(relYear!=0)
			return relYear;	
		return this.rating - obj.rating;
	}
	
	//if "this" comes first then sorts in ascending else in descending 
			//return this.rating - obj.rating;  // this logic is for integer types and for char also
			//return this.name.compareTo(obj.name); this is for string types 
			//return this.character - o.character; // this is for character type and for integer also

}