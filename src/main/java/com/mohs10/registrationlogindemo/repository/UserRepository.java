package com.mohs10.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohs10.registrationlogindemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
