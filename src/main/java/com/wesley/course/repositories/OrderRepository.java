package com.wesley.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
