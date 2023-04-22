package com.example.spring.sample.Entity;

import java.util.List;



public class Request {

	private Person person;
	private List<Product> allProducts;
	public Request() {
	}
	public Request(Person person, List<Product> allProducts) {
		this.person = person;
		this.allProducts = allProducts;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Product> getAllProducts() {
		return allProducts;
	}
	public void setAllProducts(List<Product> allProducts) {
		this.allProducts = allProducts;
	}
	@Override
	public String toString() {
		return "Request [person=" + person + ", allProducts=" + allProducts + "]";
	}
	


	
}
