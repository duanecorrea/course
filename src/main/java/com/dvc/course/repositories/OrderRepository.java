package com.dvc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
