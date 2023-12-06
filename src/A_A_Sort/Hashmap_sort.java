package A_A_Sort;

import java.util.*;
import java.util.Map.Entry;

public class Hashmap_sort {
	
	public static Map<String , Integer> revmap(Map<String , Integer> map)
	{
		List<Entry<String,Integer>> al = new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(al, (al1,al2) -> al2.getValue().compareTo(al1.getValue()));
		
		//Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

		
		Map<String,Integer> lhm = new HashMap<String,Integer>();
		
		for(Entry<String, Integer> al_map : al )
		{
			lhm.put(al_map.getKey(), al_map.getValue());
		}
		
		return lhm;
		
	}
	
	public static void main (String[] args)
	{
		Map<String , Integer> map = new HashMap<String , Integer>();
		map.put("A", 95);
		map.put("D", 75);
		map.put("C", 80);
		map.put("B", 85);
		
		Map<String , Integer> sort_map = revmap(map);
    	sort_map.forEach((k,v)->System.out.println(k + " : " + v));
    	System.out.println(sort_map);
			
	}

}
