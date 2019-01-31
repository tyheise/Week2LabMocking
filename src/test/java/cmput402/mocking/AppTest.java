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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testCapitalizeName(){
        assert("Tyler Heise".equals(Main.capitalizeName("tyler heise")))
    }

    public void testFilterEdmonton(){
        Util util = new Util();
        CityStub stub = new CityStub();
        assert(3==util.filterEdmonton(stub))
    }
}
