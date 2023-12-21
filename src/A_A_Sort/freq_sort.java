package A_A_Sort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class freq_sort {

	public static void main(String[] args)
	{
		int arry[] = {2, 5, 2, 8, 5, 6, 8, 8} ;
		freq_sorting(arry);
	}

	public static void freq_sorting(int arr[])
	{

		HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();

		for(int i=0 ; i<arr.length ; i++)
		{
			// Returns the value to which the specified key is mapped, or defaultValue 0 if this map contains no mapping for the key.
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1); 
		}

		LinkedList<Entry<Integer , Integer>> ll = new LinkedList<> (hm.entrySet());
		/*Collections.sort(ll , new Comparator<Entry<Integer, Integer>> () {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {			
				int sortHigRepKey = Integer.compare(o2.getValue(), o1.getValue());
				if(sortHigRepKey!=0) {
					return sortHigRepKey;
				}			
				return Integer.compare(o2.getKey(), o1.getKey());
			}
			
		}); */
		
		ll.sort((o1, o2) -> {
		    int sortHigRepKey = Integer.compare(o2.getValue(), o1.getValue());
		    return (sortHigRepKey != 0) ? sortHigRepKey : Integer.compare(o2.getKey(), o1.getKey());
		});

		
		for(Entry<Integer , Integer> entry : ll) {
			for(int i=0 ; i< entry.getValue() ; i++) {
				System.out.print(entry.getKey() + " ");
			}
			
		}

	}

}
