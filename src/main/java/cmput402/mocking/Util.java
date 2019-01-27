package cmput402.mocking;

public class Util {

	public String capitalizeName(String name) {
		
		
		String[] tmp;
		String capString = "";
		tmp = name.split(" ");
		capString = tmp[0].substring(0,1).toUpperCase() + tmp[0].substring(1);
		capString += " " + tmp[1].substring(0,1).toUpperCase() + tmp[1].substring(1);
		return capString;
	}
	
}
