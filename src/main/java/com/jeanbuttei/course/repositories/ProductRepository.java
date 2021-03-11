package com.jeanbuttei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanbuttei.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
