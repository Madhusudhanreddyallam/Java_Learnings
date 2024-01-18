package E_ImpPrograms;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		System.out.println(isPrimeOrNot(7));
	}

	public static boolean isPrimeOrNot(int number) {

		if(number <= 1) {
			return false;
		}
		for(int i=2 ; i<= Math.sqrt(number) ; i++) {
			if(number%i == 0) {
				return false;
			}
		}		
		return true;		
	}

}
