package com.example.spring.sample.Entity;

public class Person {
	
	private long id;
	private String name;
	private int age;
	private String gender;
	private String location;
	private String orderHistory;
	public Person() {
		super();
	}
	public Person(long id, String name, int age, String gender, String location, String orderHistory) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.orderHistory = orderHistory;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrderHistory() {
		return orderHistory;
	}
	public void setOrderHistory(String orderHistory) {
		this.orderHistory = orderHistory;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", location=" + location
				+ ", orderHistory=" + orderHistory + "]";
	}
	

}

