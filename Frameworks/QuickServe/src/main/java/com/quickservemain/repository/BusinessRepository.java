package com.quickservemain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.quickservemain.entities.Business;


public interface BusinessRepository extends JpaRepository<Business, String> {


}
