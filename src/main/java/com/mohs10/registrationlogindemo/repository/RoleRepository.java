package com.mohs10.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohs10.registrationlogindemo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
