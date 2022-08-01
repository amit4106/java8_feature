package practics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QA15 {
	static Map<String, String> map = new HashMap<>();
	static List<String> keys = new ArrayList<>(List.of("S", "P", "Q", "R"));
	static String[] values = { "senate", "people", "of", "rome" };
	static {
		for (var i = 0; i < keys.size(); i++) {
			map.put(keys.get(i), values[i]);
		}
	}

	public static void main(String[] args) {
		keys.clear();
		values = new String[0];
		System.out.println("Keys: " + keys.size() + " Values: " + values.length + " Map: " + map.size());
	}
}
