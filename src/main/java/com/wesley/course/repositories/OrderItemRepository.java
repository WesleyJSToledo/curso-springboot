package com.wesley.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.course.entities.OrderItem;
import com.wesley.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
