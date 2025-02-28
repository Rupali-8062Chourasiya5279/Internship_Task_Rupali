package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Appointments;

public interface AppointmentRepository extends JpaRepository<Appointments, String> {

}
