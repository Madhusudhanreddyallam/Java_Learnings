package C_array_programs;

public class MaxProductContiguous {

	public static void main(String[] args) {
		int[] arr = { 0,10, 1, 0 , 4, 2};
        System.out.println(maxProductOfSubArray(arr));

	}
	// https://www.youtube.com/watch?v=Y6B-7ZctiW8  (Solution explanation)
	public static int maxProductOfSubArray(int[] array) {
	    if (array == null || array.length == 0) {
	        throw new IllegalArgumentException("Array is empty or null");
	    }

	    if (array.length == 1) {
	        return array[0];
	    }

	    int len = array.length - 1;
	    int leftArrayProduct = 1;
	    int rightArrayProduct = 1;
	    int maxProductValue = array[0];

	    // Flag to check if all elements are zero
	    boolean allZero = true;

	    for (int i = 0; i <= len; i++) {
	        leftArrayProduct = (leftArrayProduct == 0) ? 1 : leftArrayProduct;
	        rightArrayProduct = (rightArrayProduct == 0) ? 1 : rightArrayProduct;

	        leftArrayProduct *= array[i];
	        rightArrayProduct *= array[len - i];

	        maxProductValue = Math.max(maxProductValue, Math.max(leftArrayProduct, rightArrayProduct));

	        // Check if all elements are zero
	        if (array[i] != 0) {
	            allZero = false;
	        }
	    }

	    // If all elements are zero, the maximum product is zero
	    if (allZero) {
	        return 0;
	    }

	    return maxProductValue;
	}


}
