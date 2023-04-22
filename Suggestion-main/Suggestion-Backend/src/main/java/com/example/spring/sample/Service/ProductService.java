package com.example.spring.sample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.sample.Entity.Product;
import com.example.spring.sample.Repository.ProductRepository;
public interface ProductService{
	public List<Product>getAllProduct();
}
// @Service
// public class ProductService {
// 	@Autowired
// 	private ProductRepository repo;
	
// 	public List<Product> getAllProduct(){
// 		return repo.getAllProduct();
// 	}

// }
