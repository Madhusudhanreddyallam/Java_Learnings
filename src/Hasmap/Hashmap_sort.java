package Hasmap;

import java.util.*;
import java.util.Map.Entry;

public class Hashmap_sort {
	
	public static HashMap<String , Integer> revmap(HashMap<String , Integer> map)
	{
		LinkedList<Entry<String,Integer>> al = new LinkedList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(al, (al1,al2) -> al2.getValue().compareTo(al1.getValue()));
		
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		
		for(Entry<String, Integer> al_map : al )
		{
			lhm.put(al_map.getKey(), al_map.getValue());
		}
		
		return lhm;
		
	}
	
	public static void main (String[] args)
	{
		HashMap<String , Integer> map = new HashMap<String , Integer>();
		map.put("A", 95);
		map.put("D", 75);
		map.put("C", 80);
		map.put("B", 85);
		
		HashMap<String , Integer> sort_map = revmap(map);
    	sort_map.forEach((k,v)->System.out.println(k + " : " + v));
    	System.out.println(sort_map);
			
	}

}
