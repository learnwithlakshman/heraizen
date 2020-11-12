package com.heraizen.cj.arrays;

import java.util.Arrays;

public class SeatAllotmentExample {

	public static void main(String[] args) {
				
				
					int capacity = 20;
					int count = 175;
					
					int requiredRoomCount = count % capacity == 0 ? count/capacity : count/capacity + 1;
					int[][]  seats = new int[requiredRoomCount][capacity];
					int k = 1;
					for(int i=0;i<requiredRoomCount;i++) {
						
						for(int j=0;j<20;j++) {
							seats[i][j] = k++;
							if(k > count) {
								break;
							}
						}
					}
					for(int i=0;i<requiredRoomCount;i++) {
						System.out.println("Student in room :"+(i+1));
						System.out.println(Arrays.toString(seats[i]));
					}
		}
}
