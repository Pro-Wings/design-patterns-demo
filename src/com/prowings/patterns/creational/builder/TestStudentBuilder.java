package com.prowings.patterns.creational.builder;

public class TestStudentBuilder {
	
	public static void main(String[] args) {
		
		Student std = new Student.StudentBuilder("Ram", "ABC")
				.mobileNumber(123123)
				.build();

		System.out.println(std);
		
		Student std1 = new Student.StudentBuilder("XYZ", "PQR").roll(123).address("Pune").mobileNumber(123123123).marks(99).build();
				
		System.out.println(std1);
	}

}
