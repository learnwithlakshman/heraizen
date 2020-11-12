package com.heraizen.cj.arrays;

public class ArrayProcessing {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// for each
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
