package com.example.demo.springSecurity.Repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.springSecurity.entities.AppUser;

public interface UserRepo extends JpaRepository<AppUser, Long>{
	
       Optional<AppUser> findByUserName(String name);
}
