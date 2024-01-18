package E_ImpPrograms;

public class FactorialOfANumber {
	
	public static void main(String[] args) {
		System.out.println(factorial2(5));
	}
	
	public static int factorial(int num) {
		int value = 1;
		
		for (int i=2 ; i <= num ; i++) {
			value *= i;
		}
		return value;
	}
	
	public static long factorial2(int num) {
		
		  if (num == 0 || num == 1) {
		        return 1;
		    }

		return num*factorial2(num-1);
	}

}
