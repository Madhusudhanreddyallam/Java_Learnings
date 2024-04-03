package F_Algo;

//Java implementation of simple method to find count of
//pairs with given sum.
import java.util.*;

public class TwoDigitsSumEqualToK {

	// Returns number of pairs in arr[0..n-1] with sum equal
	// to 'sum'
	static int getPairsCount(int arr[], int n, int k)
	{
		HashMap<Integer, Integer> m = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (m.containsKey(k - arr[i])) {
				count += m.get(k - arr[i]);
			}
			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			}
			else {
				m.put(arr[i], 1);
			}
		}
		return count;
	}

	// Driver function to test the above function
	public static void main(String[] args)
	{
		int arr[] = { 1,2,3,4};
		int n = arr.length;
		int sum = 5;
		System.out.print("Count of pairs is "
						+ getPairsCount(arr, n, sum));
	}
}

//This code is contributed by umadevi9616

