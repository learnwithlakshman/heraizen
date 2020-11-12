package com.heraizen.cj.arrays;

import java.util.Arrays;

public class MultiArrayExample {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] rowSum = new int[3];
		int[] colSum = new int[3];

		int[][] numArr = {
				{ 1, 1, 1, 1, 1 }, 
				{ 1, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 1 } };
		
		for(int i[]:numArr) {
			for(int j:i) {
				if(j == 1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			int rsum = 0;
			int csum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rsum += arr[i][j];
				csum += arr[j][i];
			}
			rowSum[i] = rsum;
			colSum[i] = csum;

		}
		
		
			
		System.out.println("Sum of each row is :" + Arrays.toString(rowSum));
		System.out.println("Sum of each col is :" + Arrays.toString(colSum));
	}
}
