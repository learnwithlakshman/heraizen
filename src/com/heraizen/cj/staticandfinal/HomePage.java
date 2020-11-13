package com.heraizen.cj.staticandfinal;

public class HomePage {

	static int count = 0;
	public HomePage() {
		count++;
		System.out.println("User count :"+count);
	}
	
	public static void main(String[] args) {
		HomePage user1 = new HomePage();
		HomePage user2 = new HomePage();
		HomePage user3 = new HomePage();
		
		System.out.println("Total active users count :"+HomePage.count);
	}
	
}
