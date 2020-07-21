package task10streams;

import junit.framework.TestCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import task10streams.Apptest10;



public class Apptest10 extends TestCase {
	  /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest10( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest10.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
