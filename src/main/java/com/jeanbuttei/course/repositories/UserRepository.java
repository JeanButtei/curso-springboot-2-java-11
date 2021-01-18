package com.jeanbuttei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanbuttei.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
