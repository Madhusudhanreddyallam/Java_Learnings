package Hasmap;

import java.util.*;
import java.util.Map.Entry;

public class hashmap_reverse {

		public static Map<String, Integer> sortByValue(Map<String, Integer> hm)
		{
			List<Map.Entry<String, Integer> > list = new ArrayList<Map.Entry<String, Integer> >(hm.entrySet());
			Collections.sort(list,(i1,i2) -> i2.getValue().compareTo(i1.getValue()));

			Map<String, Integer> temp = new LinkedHashMap<String, Integer>();
			for (Map.Entry<String, Integer> aa : list) {
				temp.put(aa.getKey(), aa.getValue());
			}
			return temp;
		}


		public static void main(String[] args)
		{

			Map<String, Integer> hm = new HashMap<String, Integer>();
			hm.put("Math", 98);
			hm.put("Data Structure", 85);
			hm.put("Database", 91);
			hm.put("Java", 95);
			hm.put("Operating System", 79);
			hm.put("Networking", 80);
			Map<String, Integer> hm1 = sortByValue(hm);

			for (Map.Entry<String, Integer> en : hm1.entrySet()) {
				System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
			}
		}
	

}

