package com.wesley.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesley.course.entities.Product;
import com.wesley.course.repositories.ProductsRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductsRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		return repository.findById(id).get();
	}
}
