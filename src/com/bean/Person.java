package com.bean;

public class Person extends Object{
	String	name	= "";
	int		age		= 0;
	
	public Person() {
		String name = "trung";
		int age = 24;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
