package com.heraizen.cj.stringexamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingDataFromFile {

		public static void main(String[] args) throws FileNotFoundException {
			StringBuilder data = new StringBuilder();
			Scanner sc = new Scanner(new File("users.txt"));
			while(sc.hasNext()) {
				String name = sc.next();
				data.append(name+",");
			}
			String res = data.substring(0, data.length()-1);
			System.out.println(res);
		}
}
