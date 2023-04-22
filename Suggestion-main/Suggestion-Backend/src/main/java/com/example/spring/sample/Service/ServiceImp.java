package com.example.spring.sample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.sample.Entity.Product;
import com.example.spring.sample.Repository.ProductRepository;

@Service
public class ServiceImp implements ProductService {
	
	@Autowired
	ProductRepository repo;

	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();
	}

	

}
