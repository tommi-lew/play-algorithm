package co.tommi.PlayAlgorithm;

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

	public void testBinarySearchWithOddNoOfValues() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals("return correct position", 0, App.binarySearch(values, 1, 0, values.length - 1));
		assertEquals("return correct position", 3, App.binarySearch(values, 4, 0, values.length - 1));
		assertEquals("return correct position", 8, App.binarySearch(values, 9, 0, values.length - 1));
	}

	public void testBinarySearchWithEvenNoOfValues() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		assertEquals("return correct position", 0, App.binarySearch(values, 1, 0, values.length - 1));
		assertEquals("return correct position", 3, App.binarySearch(values, 4, 0, values.length - 1));
		assertEquals("return correct position", 4, App.binarySearch(values, 5, 0, values.length - 1));
		assertEquals("return correct position", 7, App.binarySearch(values, 8, 0, values.length - 1));
	}

	public void testBinarySearchWithNoValues() {
		assertEquals("return 99999999 if array is empty", 99999999, App.binarySearch(new int[] {}, 2, 0, 0));
	}

	public void testBinarySearchWithOneValue() {
		assertEquals("return correct position", 0, App.binarySearch(new int[] { 5 }, 5, 0, 0));
	}
}
