package com.prowings.patterns.creational.builder;

public class Student {
	
	String firstName; //mandatory
	String lastName; //mandatory
	int roll;
	String address;
	long mobileNumber;
	int marks;

	public Student(StudentBuilder builder)
	{
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.roll = builder.roll;
		this.address = builder.address;
		this.mobileNumber = builder.mobileNumber;
		this.marks = builder.marks;
	}
	
	
	public static class StudentBuilder
	{
		String firstName; //mandatory
		String lastName; //mandatory
		int roll;
		String address;
		long mobileNumber;
		int marks;
		
		public StudentBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public StudentBuilder roll(int roll)
		{
			this.roll = roll;
			return this;
		}
		public StudentBuilder address(String address)
		{
			this.address = address;
			return this;
		}
		public StudentBuilder mobileNumber(long mobNo)
		{
			this.mobileNumber = mobNo;
			return this;
		}
		public StudentBuilder marks(int marks)
		{
			this.marks = marks;
			return this;
		}
		
		public Student build()
		{
			Student student = new Student(this);
			return student;
		}
		
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", roll=" + roll + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", marks=" + marks + "]";
	}
	
	
}
