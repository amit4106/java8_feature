package collection;

import java.util.HashMap;
import java.util.Map;

/**
 *remove
 *get
 *put
 *equals
 *values
 *hashCode
 *clear
 *isEmpty
 *replace
 *replaceAll
 *size
 *entrySet
 *putAll
 *putIfAbsent
 *forEach
 *keySet
 *compute
 *computeIfAbsent
 *containsKey
 *containsValue
 *getOrDefault
 *merge
 * @author Dell
 *
 */
public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Vikash");
		map.put(2, "Amit");
		map.put(3, "Randheer");
		map.put(4, "Manish");
		map.put(5, "Sonu");
		System.out.println(map);
		for (Map.Entry<Integer, String> e : map.entrySet()) {
//			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		String[] str = { "A", "B", "A", "C", "B" }; // To get number of count of entered String array.
		Map<String, Integer> map1 = new HashMap<>();
		for (String count : str) {
			if (map1.containsKey(count)) {
				int value = map1.get(count);
				value = value + 1;
				map1.put(count, value);
			} else {
				map1.put(count, 1);
			}
		}
//		System.out.println(map1);
	}
}
