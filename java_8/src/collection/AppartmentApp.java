package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppartmentApp {
	
	public static List<Integer> getFlatsByFloor(Integer floorNo) throws FloorDoesNotExistException{
		checkFloor(floorNo);
		if(checkFloor(floorNo)) {
			List<Integer> list = getAllFlat().get(floorNo);
			return list;
		}
		else {
			throw new FloorDoesNotExistException(floorNo + "  Flat no does not exists");
		}
	}
	
	private static boolean checkFloor(Integer floor) {
		boolean exist = getAllFlat().containsKey(floor);
		
		return exist;
	}
	
	public static Map<Integer, List<Integer>>getAllFlat() {
		Map<Integer, List<Integer>> map=new HashMap<>();
		List<Integer> list=new ArrayList<>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		map.put(1, list);
		List<Integer> list2=new ArrayList<>();
		list2.add(201);
		list2.add(202);
		list2.add(203);
		list2.add(204);
		map.put(2, list2);
		List<Integer> list3 = Arrays.asList(301,302,303,304);
		map.put(3, list3);
		List<Integer> list4 = Arrays.asList(401,402,403,404);
		map.put(4, list4);
		map.put(5, Arrays.asList(501,502,503,504));
		return map;
	}
	
	public static void main(String[] args) {
try {
List<Integer> flats = getFlatsByFloor(6);
flats.forEach(System.out::println);
}
catch (FloorDoesNotExistException e) {
System.out.println(e.getMessage());
}

	}

}
