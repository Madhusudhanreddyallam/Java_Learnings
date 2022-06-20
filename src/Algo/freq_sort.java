package Algo;

import java.util.Collections;
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
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}

		LinkedList<Entry<Integer , Integer>> ll = new LinkedList<Entry<Integer , Integer>> (hm.entrySet());
		Collections.sort(ll , (a1,a2)-> a2.getValue().compareTo(a1.getValue()));
		for(Entry<Integer , Integer> loop : ll)
		{
			for(int i=0 ; i<loop.getValue() ; i++)
				System.out.print(loop.getKey() + " ");
		}


	}

}
