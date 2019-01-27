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
       

       
       List<String> mockCityList1= new ArrayList<String>();
       mockCityList1.add("Edmonton");
       mockCityList1.add("Toronto");
       
       
       // we can test two thenReturn
       // will return list1 in first time, and list two in second call
       
       List<String> mockCityList2= new ArrayList<String>();
       mockCityList2.add("Edmonton");
       mockCityList2.add("Edmonton");
       
       when(city.listCities()).thenReturn(mockCityList1).thenReturn(mockCityList2);
       
       assert(1==util.countACity(city));
       assert(2==util.countACity(city));
       // do some testing with two thenReturn.
       //firstime called will execute the first return, second time call will execute 
       // second return
       
	  // now work with anyInt, 
       // then, another example with thenThrow(new RuntimeException)
   }
   
   //exception testing is easier with Junit 4 with the @Test annotation
   //e.g.,  @Test (expected = RunTimeException.class)
   public void testEdmontonRatio() {
	   try {
	   assert(25000==util.edmontonRatio(50000,0));
	   fail("It should have thrown an exception");
	   }catch(Exception e) {}
	   
   }
   
 
}
