package com.heraizen.cj.stringexamples;

public class StringBasicExample {

	public static void main(String[] args) {
		String name1 = "Krish";
		String name2 = "Krish";

		String name3 = new String("Krish");
		String name4 = new String("Krish");
		System.out.println(name1 == name2);
		System.out.println(name3 == name4);

		System.out.println(name3.equals(name4));

		String data = "Hello how are you?";
		System.out.println(data.length());
		String names = "Manoj,Suresh,Ramesh, Jayesh, Kamlesh";
		String[] nameArray = names.split(",");
		for (String name : nameArray) {
			System.out.println(name.trim().toUpperCase().substring(0, 3).concat("-").concat("HERAIZEN"));
		}

		String name = "Manoj";
		int age = 23;
		float salary = 560000;
		System.out.println(String.format("Name :%s Age: %d  Salary: %f", name, age, salary));
		
		String user = "Krish";
		System.out.println(user.concat(" T"));
		System.out.println(user);
	}
}
