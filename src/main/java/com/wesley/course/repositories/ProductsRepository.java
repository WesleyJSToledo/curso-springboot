package com.wesley.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.course.entities.Product;

public interface ProductsRepository extends JpaRepository<Product, Long>{

}
