package com.quickservemain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Users;

public interface UserRepository extends JpaRepository<Users, String> {

	public Users findByEmail(String reqemail);

	public Users findByEmailAndPassword(String reqemail, String reqpassword);

	public Optional<Users> findByUserid(Users uid);

}
