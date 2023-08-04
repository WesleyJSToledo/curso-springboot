package com.wesley.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
