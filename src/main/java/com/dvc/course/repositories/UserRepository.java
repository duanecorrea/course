package com.dvc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
