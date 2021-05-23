package com.spring.ioc.vo;

public class Dog {
    private int age=5;
    private String color;
    
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Dog(int age, String color) {
		super();
		this.age = age;
		this.color = color;
		System.out.println("dog有参构造被创建");
	}
    
	public Dog() {
		super();
		System.out.println("dog无参构造被创建");
	}
	/**
	 * toString只有这个对象呗调用了才会调用这个方法
	 */
	@Override
	public String toString() {
		return "Dog [age=" + age + ", color=" + color + "]";
	}
	
}
