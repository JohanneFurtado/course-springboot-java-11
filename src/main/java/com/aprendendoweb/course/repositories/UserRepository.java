package com.aprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
