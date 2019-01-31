pacakge cmput402.mocking;

import service.City;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public int filterEdmonton(City city){
        int count=0;
        List<String> cities = new ArrayList<String>();
        cities=city.listCities();
        for(String aCity: cities){
            if(aCity.equals("Edmonton")){
                count++;
            }
        }

    }
}
