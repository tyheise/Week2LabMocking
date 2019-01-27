package cmput402.mocking;

import static org.mockito.Mock.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import service.City;
import stub.CityMock;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	Util util =new Util();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    
   public void testCapitalizeName() {
	   
	   assert("Abram Hindle".equals(util.capitalizeName("abram Hindle")));
	   assert("Abram Hindle".equals(util.capitalizeName("abram Hindle")));
	   assert("Abram Hindle".equals(util.capitalizeName("abram hindle")));
	   
   }
   
   public void testCountACity() {

	   // so this city is now a mock instance of City
	   City city=mock(City.class);
	   
       //no implementation, yet returned the default value
       //This is a big advantage of mockito. 

       assert(city.listCities().size()==0);
       

       
       List<String> mockCityList= new ArrayList<String>();
       mockCityList.add("Edmonton");
       mockCityList.add("Toronto");
       
       when(city.listCities()).thenReturn(mockCityList);
        
       
       int numCities=util.countACity(city);
       assert(numCities==1);
       
       
	  
   }
 
}
