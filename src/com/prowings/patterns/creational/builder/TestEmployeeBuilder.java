package com.prowings.patterns.creational.builder;

public class TestEmployeeBuilder {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee.EmployeeBuilder()
				.address("Pune")
				.firstName("Ram")
				.lastName("Prabhu")
				.id(123)
				.build();
		
		System.out.println(emp);
		
		Employee emp1 = new Employee.EmployeeBuilder().firstName("Ram").build();
		
		System.out.println(emp1);
	}

}
