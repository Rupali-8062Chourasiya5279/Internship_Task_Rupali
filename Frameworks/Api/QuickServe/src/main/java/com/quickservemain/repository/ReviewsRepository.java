package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, String> {

}
