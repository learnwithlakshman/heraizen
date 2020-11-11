package com.heraizen.cj.basics;

/***
 * Program to print hello world message
 * 
 * @author Lakshman
 *
 */

public class HelloWorld {
	/**
	 * Java program execution starts form main
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String name = "Guest";
		if (args.length > 0 /* checking args length */) {   // if user name is passed as argument, it will be collected to name variable
			name = args[0];
		}
	    System.out.println("Hi " + name + "\nWelcome to Java world!");
	}
}