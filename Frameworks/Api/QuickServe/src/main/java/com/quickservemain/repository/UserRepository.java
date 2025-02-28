package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Users;

public interface UserRepository extends JpaRepository<Users, String> {

}
