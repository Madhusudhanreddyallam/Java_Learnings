package Hasmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_iteration {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		HashMap<String , Integer> map = new HashMap<String , Integer> ();
		map.put("Madhu", 100);
		map.put("Suma", 100);

		System.out.println(map.get("Suma"));
		
		//1. Using foreach method
		map.forEach((k,v) -> System.out.println(k+v));
		
		//2. Iterator
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = (String) it.next();
			Integer value = map.get(key);
			
			System.out.println(key + " = " + value);
			
		}
		
		//3. Iterate key & value both
		
		Iterator<Entry<String, Integer>>  it2 = map.entrySet().iterator();
		
		while(it2.hasNext())
		{
			Entry<String, Integer> entry = it2.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		for(Map.Entry ent : ((Map<String, Integer>) it2).entrySet())
		{
			System.out.println(ent.getKey() + "=" + ent.getValue());
		}
		
		for(Map.Entry<String, Integer> mp : map.entrySet())
		{
			System.out.println(mp.getKey() + mp.getValue());
		}
	}

}
