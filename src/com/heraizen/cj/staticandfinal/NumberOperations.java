package com.heraizen.cj.staticandfinal;

class Employee {

	private int empno;
	private String name;
	private double salary;

	private Employee(EmployeeBuilder eb) {
		this.empno = eb.empno;
		this.name = eb.name;
		this.salary = eb.salary;
	}

	

	public static class EmployeeBuilder {

		private int empno;
		private String name;
		private double salary;

		public EmployeeBuilder withEmpno(int empno) {
			this.empno = empno;
			return this;
		}

		public EmployeeBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder withSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

final class ArrayOperations {

	private ArrayOperations() {

	}

	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;
	}
}

public class NumberOperations {

	public static void main(String[] args) {
		System.out.println(ArrayOperations.sumOfElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		
		Employee emp =new Employee.EmployeeBuilder().withEmpno(1001).withName("Krish").withSalary(45000).build();
	}
}
