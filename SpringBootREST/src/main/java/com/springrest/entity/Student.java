package com.springrest.entity;

public class Student {
	private String firstname;
	private int roll;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstname, int roll, String lastname) {
		super();
		this.firstname = firstname;
		this.roll = roll;
		this.lastname = lastname;
	}

}
