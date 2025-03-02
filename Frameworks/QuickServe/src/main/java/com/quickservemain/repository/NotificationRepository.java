package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Notifications;

public interface NotificationRepository extends JpaRepository<Notifications, String> {

}
