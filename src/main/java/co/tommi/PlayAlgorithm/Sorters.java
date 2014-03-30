package co.tommi.PlayAlgorithm;

public class Sorters {
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int small = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[small]) {
					small = j;
				}
			}

			// swap
			int temp = arr[i];
			arr[i] = arr[small];
			arr[small] = temp;
		}

		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i;

			while (j > 0 && current < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = current;
		}

		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}

			if (!swapped) return arr;
		}

		return arr;
	}

	public static int[] quickSort(int[] values) {
		return null;
	}

	public static int[] mergeSort(int[] values) {
		return null;
	}
}
