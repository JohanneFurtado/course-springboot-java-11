package com.aprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
