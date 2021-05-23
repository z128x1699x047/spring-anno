package com.spring.ioc.vo;

public class Tiger {

	private String name;
	private int age;
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
	public Tiger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Tiger() {
		super();		
	}
}
