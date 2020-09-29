package com.aprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
