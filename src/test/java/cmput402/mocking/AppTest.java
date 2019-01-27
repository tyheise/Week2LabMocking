package cmput402.mocking;

import static org.mockito.Mock.*;
import static org.mockito.Mockito.mock;

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
	   City city=mock(City.class);
	  
	  
   }
 
}
