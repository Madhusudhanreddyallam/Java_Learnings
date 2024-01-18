package E_ImpPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonaciSeries(10);
	}

	public static void fibonaciSeries(int number) {
		int firstTerm = 0 , seconTerm = 1 , nextTerm;

		for(int i =0 ; i< number ; i++) {
			System.out.print(firstTerm + " ");
			nextTerm = firstTerm + seconTerm; // 0+ 1
			firstTerm = seconTerm; // 1
			seconTerm = nextTerm;  // 1


		}

	}

}
