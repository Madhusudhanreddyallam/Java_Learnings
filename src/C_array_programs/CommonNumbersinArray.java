package C_array_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CommonNumbersinArray {

	public static void main(String[] args) {
		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		Map<Integer, Integer> hm = new HashMap<Integer , Integer>();
		int i=0 , j= 0 , k =0;
		while(i < ar1.length || j<ar2.length || k<ar3.length) {
			if (i < ar1.length ) {
				hm.put(ar1[i], hm.getOrDefault(ar1[i], 0)+1);
				i++;
			}
			if (j < ar2.length ) {
				hm.put(ar2[j], hm.getOrDefault(ar2[j], 0)+1);
				j++;
			}

			if (k < ar3.length ) {
				hm.put(ar3[k], hm.getOrDefault(ar3[k], 0)+1);
				k++;
			}
		}


		for(Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()== 3) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

}
