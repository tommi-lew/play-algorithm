package co.tommi.PlayAlgorithm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SortersTest {
	@Test
	public void testSelectionSort() {
		int[] result = Sorters.selectionSort(new int[] { 9, 8, 7, 6, 5, 4, 3, 2 });
		assertTrue("should sort the array", isSorted(result));
	}

	@Test
	public void testInsertionSort() {
		int[] result = Sorters.insertionSort(new int[] { 9, 8, 7, 6, 5, 4, 3, 2 });
		assertTrue("should sort the array", isSorted(result));
	}

	@Test
	public void testBubbleSort() {
		int[] result = Sorters.bubbleSort(new int[] { 9, 8, 7, 6, 5, 4, 3, 2 });
		assertTrue("should sort the array", isSorted(result));
	}

	@Test
	public void testQuickSort() {
	}

	@Test
	public void testMergeSort() {
	}

	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(String.format("Index %02d: %s", i, arr[i]));
		}
	}
}