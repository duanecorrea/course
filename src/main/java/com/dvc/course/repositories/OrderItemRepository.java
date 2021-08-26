package com.dvc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
