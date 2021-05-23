package com.spring.ioc.value;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Value赋值
 * 对属性注解
 * 对方法注解
 * 对方法中的参数注解
 * 赋值的方式：1.基本字符   2.springEL表达式  3.读取配置文件
 * @author pt -zhangxinxing
 *
 */
public class User {
    @Value("zhangsan")
	private String name;
    
	private int age;
	//@Value("${user.color}")
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Value("#{25-3}")//springEL表达式
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	/**
	 * 读取properties文件中的值---在配置文件中加个注解
	 * @param color
	 */
	public void setColor(@Value("${user.color}") String color) {
		this.color = color;
	}
	/*public void setColor(@Value("red") String color) {
	    this.color = color;
    }*/
	public User(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", color=" + color + "]";
	}	
	
}
