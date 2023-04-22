package com.example.spring.sample.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	private int id;
	private String Cateogory;
	private String product;
	private String size;
	private String color;
	private int price;
	public Product() {
	}
	public Product(int id, String cateogory, String product, String size, String color, int price) {
		this.id = id;
		Cateogory = cateogory;
		this.product = product;
		this.size = size;
		this.color = color;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCateogory() {
		return Cateogory;
	}
	public void setCateogory(String cateogory) {
		Cateogory = cateogory;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Cateogory=" + Cateogory + ", product=" + product + ", size=" + size + ", color="
				+ color + ", price=" + price + "]";
	}
	
}