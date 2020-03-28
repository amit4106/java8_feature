package AppartmentApp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppartmentDB {

	public static Map<Integer, List<FlatDetails>> fetchFlatsByFloorNumber(){
		Map<Integer, List<FlatDetails>> map=new HashMap<>();
		FlatDetails fd=new FlatDetails(1, 101, 10000, true);
		FlatDetails fd2=new FlatDetails(1, 102, 10000, true);
		FlatDetails fd3=new FlatDetails(1, 103, 11000, false);
		List<FlatDetails> flats = Arrays.asList(fd, fd2, fd3);
		map.put(1, flats);
		return map;
	}
	
	public static List<FlatDetails> fetchAllFlats(){
		FlatDetails fd=new FlatDetails(1, 101, 10000, true);
		FlatDetails fd2=new FlatDetails(1, 102, 10000, true);
		FlatDetails fd3=new FlatDetails(1, 103, 11000, false);
		List<FlatDetails> flats = Arrays.asList(fd, fd2, fd3);
		return flats;
	}
}
