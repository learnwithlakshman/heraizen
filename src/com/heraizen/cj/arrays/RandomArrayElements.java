package com.heraizen.cj.arrays;
import static com.heraizen.cj.arrays.ArrayOperationWithIntegers.biggest;
import static com.heraizen.cj.arrays.ArrayOperationWithIntegers.smallest;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayElements {

	public static void main(String[] args) {
		int[] arr = new int[ThreadLocalRandom.current().nextInt(10, 16)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 101);
		}
		out.println("Size of the array is :" + arr.length);
		out.println(Arrays.toString(arr));
		out.println("Biggest  element is :"+biggest(arr));
		out.println("Smallest element is :"+smallest(arr));
	}

	
}
