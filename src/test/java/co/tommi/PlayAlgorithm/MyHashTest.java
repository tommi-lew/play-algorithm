package co.tommi.PlayAlgorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyHashTest {
	MyHash aHash = null;

	@Before
	public void setUp() {
		aHash = new MyHash();
	}

	@Test
	public void testPutShouldNotThrowAnyExceptions() {
		aHash.put(0, "some1");
		aHash.put(9, "some2");
		aHash.put(10, "some3");
		aHash.put(15, "some4");
		aHash.put(100, "some5");
	}

	@Test
	public void testGet() {
		aHash.put(0, "some1");
		aHash.put(9, "some2");
		aHash.put(10, "some3");
		aHash.put(15, "some4");
		aHash.put(100, "some5");

		assertEquals("should return correct value", "some1", aHash.get(0));
		assertEquals("should return correct value", "some2", aHash.get(9));
		assertEquals("should return correct value", "some3", aHash.get(10));
		assertEquals("should return correct value", "some4", aHash.get(15));
		assertEquals("should return correct value", "some5", aHash.get(100));
	}

	@Test
	public void testCalculatePosition() {
		assertEquals("should be the same value as the key", 0, aHash.calculatePosition(0));
		assertEquals("should be the same value as the key", 5, aHash.calculatePosition(5));
		assertEquals("should be the same value as the key", 10, aHash.calculatePosition(10));
	}
}
