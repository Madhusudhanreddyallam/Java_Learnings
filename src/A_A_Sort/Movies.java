package A_A_Sort;

class Movies {

	private String name;
	private int rating;
	private int releaseYear;

	public Movies(String name , int rating , int year) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = year;
	}

	public String getName() {
		return name;
	}

	public int getRating() {
		return rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

}