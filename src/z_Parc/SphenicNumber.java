package z_Parc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SphenicNumber {
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] primeNumbers = getPrimeNumbersFromArray(inputArray);
		int[] sphenicNumbers =productOfThreeDistinctPrimeNo(primeNumbers);
		System.out.println(Arrays.toString(sphenicNumbers));
	}

	public static int[] productOfThreeDistinctPrimeNo(int[] array) {
		List<Integer> primeProdcut = new ArrayList<>();
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					primeProdcut.add( array[i] * array[j] * array[k]);
				}
			}
		}
		Collections.sort(primeProdcut, Collections.reverseOrder());
		int[] primeProductArray = listToArray(primeProdcut);
		return primeProductArray;
	}

	public static int[] getPrimeNumbersFromArray(int[] array) {
		List<Integer> primeList = new ArrayList<>();
		for (int num : array) {
			if (isPrime(num)) {
				primeList.add(num);
			}
		}
		int[] primeArray = listToArray(primeList);
		return primeArray;
	}


	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] listToArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = (int) list.get(i);
		}
		return array;
	}
}
