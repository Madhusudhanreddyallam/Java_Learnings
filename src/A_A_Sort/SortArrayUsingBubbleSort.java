package A_A_Sort;

	public class SortArrayUsingBubbleSort {
		public static void main(String[] args) {
			
			Integer[] array = {100 , 104, 107 , 103 ,105 , 102 ,106}; 
			sortArray(array);
	        for(int i: array)
	        	System.out.print(i + " ");
		}	
		
		/*
		 1) public static: This indicates that the method is a public and static method.
		 2) <T extends Comparable<T>>: This is a type parameter declaration. It says that the method is generic,
		    and it can work with any type T that implements the Comparable<T> interface(All the wrapper classes implements Comparable)
		    . The Comparable interface provides a compareTo method, which is essential for sorting. 
		  3) void: This is the return type of the method. In this case, the method does not return any value (void means no return value).
		 */
		
		public static <T extends Comparable<T>> void sortArray(T[] arr) {
			int n = arr.length;
			boolean swapping;
			
			do {
				swapping = false;
				for(int i=1 ; i<n ;i++) {
					if(arr[i-1].compareTo(arr[i]) < 0) { // greater than ascending less than descending
						T temp = arr[i-1];
						arr[i-1] = arr[i];
						arr[i] = temp;
						swapping = true;
					}
				}
				n--;
			} while(swapping);
			
		}
	}

