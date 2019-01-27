package stub;

import java.util.ArrayList;
import java.util.List;

import service.City;

public class CityMock implements City {

	public List<String> listCities() {
		
		List<String> listCities = new ArrayList<String>();
		
		listCities.add("Toronto");
		listCities.add("Toronto");
		listCities.add("Edmonton");
		listCities.add("Edmonton");
		listCities.add("Saskatoon");
		
		return listCities;
	}

}
