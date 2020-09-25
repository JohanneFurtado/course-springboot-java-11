package com.aprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
