package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User;

/**
 * InnerUserRepository
 */
public interface InnerUserRepository extends JpaRepository<User , Integer> {

    
}