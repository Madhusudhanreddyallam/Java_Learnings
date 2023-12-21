package z_Parc;

import java.io.IOException;

public class SetExample {
	 public static void main(String[] args) throws IOException {
		 isPrime(15);
	 }
	 
		public static boolean isPrime(int n) {
			if (n <= 1) {
				return false;
			}
			System.out.println(Math.sqrt(n));
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}

}
