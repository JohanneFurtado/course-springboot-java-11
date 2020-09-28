package com.aprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
