package com.gojava.task;

public class ArrayUtils {

	public static int minValue(int[] array) {
		int minValue = Integer.MAX_VALUE;
		if (array != null && array.length != 0) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] < minValue) {
					minValue = array[i];
				}
			}
		}
		return minValue;
	}

	public static int maxValue(int[] array) {
		int maxValue = Integer.MIN_VALUE;
		if (array != null && array.length != 0) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] > maxValue) {
					maxValue = array[i];
				}
			}
		}
		return maxValue;
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int key = array[i];
			while ((j > -1) && (array[j] > key)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void quickSort(int array[]) {
		quickSort(array, 0, array.length - 1);
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void quickSort(int array[], int from, int to) {
		int fromIndex = from;
		int toIndex = to;

		if (to - from >= 1) {
			int pivot = array[from];
			while (toIndex > fromIndex) {
				while (array[fromIndex] <= pivot && fromIndex <= to && toIndex > fromIndex)
					fromIndex++;
				while (array[toIndex] > pivot && toIndex >= from && toIndex >= fromIndex)
					toIndex--;
				if (toIndex > fromIndex) {
					swap(array, fromIndex, toIndex);
				}
			}
			swap(array, from, toIndex);
			quickSort(array, from, toIndex - 1);
			quickSort(array, toIndex + 1, to);
		} else {
			return;
		}
	}

}
