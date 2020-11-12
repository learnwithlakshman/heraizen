package com.heraizen.cj.arrays;

import java.util.Arrays;

public class ArrayReference {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap : a = " + a + " and b = " + b);
		swap(a, b);
		int[] arr = { 1, 2, 3 };
		System.out.println("Before increment :" + Arrays.toString(arr));
		increment(arr);
		System.out.println("After increment :" + Arrays.toString(arr));

	}

	private static void increment(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] + 1;
		}
	}

	private static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
		System.out.println("After swap : a = " + a + " and b = " + b);
	}
}
