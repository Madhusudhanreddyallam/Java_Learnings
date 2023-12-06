package C_array_programs;

import java.util.Arrays;

public class CharaterAndRepeatation {

	public static void main(String[] args) {

		char[] a = {'a','a','b','b','c','C','c','D'};	
		a = new String(a).toLowerCase().toCharArray(); //in case if array is case sensitive
		Arrays.sort(a);
		int count = 1;
		for(int i=0 ; i<a.length ; i++) { // Iterate the loop till last index in the array
			if(i==a.length-1) { //if the reached to last index print last index char and count
				System.out.println(a[i]+""+count);
			}
			else if(a[i]==a[i+1]) { //else if you see consecutive char matching keep increasing the count
				count++;
			}else {
				System.out.print(a[i]+""+count); // when the consecutive char doesn't match then print the value with count 
				count = 1;   //and rest count to 1
			}
		}

	}

}
