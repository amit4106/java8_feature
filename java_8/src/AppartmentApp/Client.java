package AppartmentApp;

import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		AppartmentInfoService service=new AppartmentInfoServiceImpl();
		List<FlatDetails> flats = service.getAllFlats();
		Iterator<FlatDetails> iterator = flats.iterator();
	while(iterator.hasNext()) {
		FlatDetails flat = iterator.next();
		System.out.println(flat.getFloorNo()  +" "+ flat.getFlatNo() +" "+ flat.getRent()+ " " +flat.isVacated() );
	}
	}

}
