package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		System.out.println(map2.put("Raju", 91));
		map2.put("Rakesh", 92);
		map.put("Amit", 79);
		map.put("Atul", 73);
		map.put("Lee", 71);
		System.out.println(map.put("Lee", 100));;
//		for(Map.Entry<String, Integer> e:map.entrySet()) {
//			System.out.println(e.getKey()+ " " + e.getValue());
//		}
		System.out.println("---"+map.entrySet());

		// System.out.println(map.get("Amit"));;
		// System.out.println("++-->> "+map.size());
		// map.putAll(map2);
		System.out.println(map.keySet());;
		//map.putIfAbsent("Vikash", 79);
		System.out.println(map);
		// System.out.println(">> "+map.values());

	}

}
