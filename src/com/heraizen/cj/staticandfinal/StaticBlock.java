package com.heraizen.cj.staticandfinal;

public class StaticBlock {
	static int a = 10;
	int res = 100;
	static {
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		StaticBlock obj = new StaticBlock();
		System.out.println(obj.res);
	}

	

}
