package com.Problem2;

public abstract class Student {

	
	 String name;
	 String address;
	
	 public Student() {
			super();
		}
	 
	 
	 public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public abstract double getPercentage();

	
	
	
	
	
	
}
