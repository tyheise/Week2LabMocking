package cmput402.mocking;

import java.util.List;

import service.City;

public class Util {

	public String capitalizeName(String name) {
		
		
		String[] tmp;
		String capString = "";
		tmp = name.split(" ");
		capString = tmp[0].substring(0,1).toUpperCase() + tmp[0].substring(1);
		capString += " " + tmp[1].substring(0,1).toUpperCase() + tmp[1].substring(1);
		return capString;
	}
	
	public int countACity( City city) {
		
		List<String> listCities= city.listCities();
		int count=0;
		for(String seekCity: listCities) {
			if(seekCity.equals("Edmonton")) {
				count++;
			}
		}
		return count;
	} 
	
	public int edmontonRatio(int total, int inEdmonton) throws Exception{
		
		if(inEdmonton==0) {
			throw new Exception();
		}
		return total/inEdmonton;
		
	}
}
