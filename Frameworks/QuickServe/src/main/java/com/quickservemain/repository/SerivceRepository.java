package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Service;

public interface SerivceRepository extends JpaRepository<Service, String> {

}
