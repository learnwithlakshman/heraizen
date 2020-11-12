package com.heraizen.cj.arrays;

public class ArrayOperationWithIntegers {

	public static int biggest(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int smallest(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getElePosition(int[] arr, int key) {

		return 0;
	}

	public static int occuranceCount(int[] arr, int key) {

		return 0;
	}

	public static int[] sort(int[] arr) {

		return null;
	}

}
