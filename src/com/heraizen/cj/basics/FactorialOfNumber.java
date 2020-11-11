package com.heraizen.cj.basics;

import java.util.Scanner;

/*
 *   Write a program to accept a number and find its factorial.
 *
 */
public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		int num = sc.nextInt();
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		System.out.println("Factorial of " + num + " is " + res);
		sc.close();
	}
}
