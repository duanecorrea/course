package com.dvc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvc.course.entities.Category;
import com.dvc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
