package C_array_programs;

public class RemoveDupe {
	public static void main(String[] args) {

		//Integer[] array = {100 , 104, 100, 107 , 103 ,105 , 102 ,106}; 
		//String[] array = {"Madhu" , "Dhiraj" , "Aslan", "Zubair" , "Suma" , "Aslan" };
		Character[] array = { 'A' , 'Z' , 'Y' , 'B' , 'Z', 'A'};
		sortArray(array);
		System.out.println("\n");
		removeDupe(array);

	}	

	public static <T extends Comparable<T>> void sortArray(T[] arr) {
		int n = arr.length;
		boolean swapping;

		do {
			swapping = false;
			for(int i=1 ; i<n ;i++) {
				if(arr[i-1].compareTo(arr[i]) > 0) {
					T temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					swapping = true;
				}
			}
			n--;
		} while(swapping);

		for(T t: arr)
			System.out.print(t+ " ");

	}

	public static <T> void removeDupe(T[] arr) {
		int n = arr.length;
		for(int i=0 ; i< n-1 ; i++) {
			if(!arr[i].equals(arr[i+1]))
				System.out.print(arr[i]+ " ");
		} System.out.print(arr[n-1]);
	}

}
