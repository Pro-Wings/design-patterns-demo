package com.prowings.patterns.creational.builder;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
public class Employee {
	
	@NonNull
	String firstName; //mandatory
	String lastName; //mandatory
	int id;
	String address;
	int pin;
	long mobileNumber;


}
