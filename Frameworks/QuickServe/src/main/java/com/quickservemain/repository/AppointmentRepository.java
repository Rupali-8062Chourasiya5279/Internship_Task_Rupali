package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Appointments;
import com.quickservemain.entities.Appointments.Status;

public interface AppointmentRepository extends JpaRepository<Appointments, String> {

	public long countByStatus(Status status);

}
