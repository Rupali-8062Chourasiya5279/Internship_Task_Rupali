package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Payments;

public interface PaymentsRepository extends JpaRepository<Payments, String> {

}
