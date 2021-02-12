package com.jeanbuttei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanbuttei.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
