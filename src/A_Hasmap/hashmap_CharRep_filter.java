package A_Hasmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hashmap_CharRep_filter {	
	
		public static void characterCount(String inputString)
		{
            //increase char count using map
			Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
			for (char c : inputString.toCharArray()) {
				if (charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c) + 1);
				}
				else {
					charCountMap.put(c, 1);
				}
			}
			for(Entry<Character, Integer> mp : charCountMap.entrySet())
			{
				System.out.print(mp.getKey() +"="+ mp.getValue()+" ");
			}
			
            
			//filter using value > 1
			Map<Character , Integer> flt = charCountMap.entrySet()
					                       .stream()
					                       .filter(map-> map.getValue() > 1)
					                       .collect(Collectors.toMap(map -> map.getKey() , map-> map.getValue()));
			System.out.println(flt);
			
			//filter using key 
			Map<Character , Integer> fltr = charCountMap.entrySet()
					                       .stream()
					                       .filter(map-> map.getKey()=='A')
					                       .collect(Collectors.toMap(map -> map.getKey() , map-> map.getValue()));
			System.out.println(fltr);
			
			//using List to filter based on value
			List<Entry<Character , Integer>> list = new ArrayList<Entry<Character , Integer>>(charCountMap.entrySet());
			for (Entry<Character , Integer> en : list)
			{
				if(en.getValue() > 1)
				System.out.println(en.getKey() + " == " + en.getValue() ) ;
			}
			
			//using List to filter based on key
			List<Entry<Character , Integer>> listkey = new ArrayList<Entry<Character , Integer>>(charCountMap.entrySet());
			for (Entry<Character , Integer> en : listkey)
			{
				if(en.getKey() == 'A')
				System.out.println(en.getKey() + " == " + en.getValue() ) ;
			}
		}

		public static void main(String[] args)
		{
			String str = "Ajjit";
			characterCount(str);
		}
	}



