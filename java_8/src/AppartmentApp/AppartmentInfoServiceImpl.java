package AppartmentApp;

import java.util.List;

public class AppartmentInfoServiceImpl implements AppartmentInfoService {

	@Override
	public List<FlatDetails> getAllFlats() {
		
		return AppartmentDB.fetchAllFlats();
	}

	@Override
	public List<FlatDetails> getVacatedFlats() {
		List<FlatDetails> flats = AppartmentDB.fetchAllFlats();
		return null;
	}

	@Override
	public FlatDetails searchFlatByFloorNumber(int floorNumber) {
		return null;
	}

}
