package Hasmap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap_compare {
	
	public static void main(String [] args)
	{
		HashMap<String, String> m1 = new HashMap<String , String>();
		m1.put("100", "Madhu");
		m1.put("200", "Suma");
		
		HashMap<String, String> m2 = new HashMap<String , String>();
		m2.put("300", "Niharika");
		m2.put("100", "Madhu");
		m2.put("200", "Suma");
		
		//compare 2 hashmaps
		System.out.println(m2.equals(m1));
		
		//compare 2 hashmaps keys
		System.out.println(m2.keySet().equals(m1.keySet()));
		
		//compare 2 hashmaps values
		System.out.println(m2.values().equals(m1.values()));
		
		//find the extra hasmap key & value
		HashSet<String> set = new HashSet<>(m1.keySet());
		set.addAll(m2.keySet());
		set.removeAll(m1.keySet());
		System.out.println(set);


	}

}
