package cmput402.mocking;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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
	   Util util =new Util();
	   assert("Abram Hindle".equals(util.capitalizeName("abram Hindle")));
	   assert("Abram Hindle".equals(util.capitalizeName("abram Hindle")));
	   assert("Abram Hindle".equals(util.capitalizeName("abram hindle")));
	   
   }
 
}
