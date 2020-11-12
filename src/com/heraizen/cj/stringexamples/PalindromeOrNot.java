package com.heraizen.cj.stringexamples;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String data = "12321";
		
		boolean isPalindrome = true;
		for (int i = 0, j = data.length() - 1; i <= j; i++, j--) {
			if (data.charAt(i) != data.charAt(j)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(data + " is palindrome");
		} else {
			System.out.println(data + " is not a palindrome");
		}

		if (new StringBuilder(data).reverse().toString().equals(data)) {
			System.out.println(data + " is palindrome");
		} else {
			System.out.println(data + " is not a palindrome");
		}
	}
}
