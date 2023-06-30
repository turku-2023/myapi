package com.example.myapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.myapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}