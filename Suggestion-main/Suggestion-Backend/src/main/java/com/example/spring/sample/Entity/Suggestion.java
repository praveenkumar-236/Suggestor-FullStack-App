package com.example.spring.sample.Entity;

import java.util.ArrayList;

public class Suggestion {
		
	private ArrayList<Product> recommendedProducts;

	public Suggestion() {
		super();
	}

	public ArrayList<Product> getRecommendedProducts() {
		return recommendedProducts;
	}

	public void setRecommendedProducts(ArrayList<Product> recommendedProducts) {
		this.recommendedProducts = recommendedProducts;
	}

	@Override
	public String toString() {
		return "Suggestion [recommendedProducts=" + recommendedProducts + "]";
	}
	

}
