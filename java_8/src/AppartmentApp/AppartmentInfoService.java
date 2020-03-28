package AppartmentApp;

import java.util.List;

public interface AppartmentInfoService {

public List<FlatDetails> getAllFlats();

public List<FlatDetails> getVacatedFlats();

public FlatDetails searchFlatByFloorNumber(int flatNo);


}
