package com.gojava.task;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandomNumberFrom(-1000, 1000);
		}
		long start = System.currentTimeMillis();
		ArrayUtils.quickSort(arr);
		long end = System.currentTimeMillis();
		System.out.println("QuickSort: \n" + (end - start));

		start = System.currentTimeMillis();
		ArrayUtils.quickSort(arr);
		end = System.currentTimeMillis();
		System.out.println(end - start +" (already sorted)");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandomNumberFrom(-1000, 1000);
		}
		start = System.currentTimeMillis();
		ArrayUtils.insertionSort(arr);
		end = System.currentTimeMillis();
		System.out.println("InsertionSort: \n" + (end - start));

		start = System.currentTimeMillis();
		ArrayUtils.insertionSort(arr);
		end = System.currentTimeMillis();
		System.out.println(end - start +" (already sorted)");

	}

	public static int getRandomNumberFrom(int min, int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt((max + 1) - min) + min;
		return randomNumber;
	}
}
