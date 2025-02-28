package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public List<Customer> findByName(String name);
	public List<Customer> findByGender(String gender);
	public List<Customer> findByCity(String city);
	public List<Customer> findByEmail(String email);
	
	public List<Customer> findByNameAndGender(String name,String gender);
	public List<Customer> findByNameAndCity(String name,String city);
	public List<Customer> findByNameAndEmail(String name,String email);
	public List<Customer> findByCityAndGender(String city,String gender);
	public List<Customer> findByNameAndPhone(String name,String phone);
	
	public List<Customer> findByNameOrGender(String name,String gender);
	public List<Customer> findByNameOrCity(String name,String city);
	public List<Customer> findByNameOrEmail(String name,String email);
	public List<Customer> findByCityOrGender(String city,String gender);
	public List<Customer> findByNameOrPhone(String name,String phone);
	
	public List<Customer> findByNameAndCityAndGender(String name,String city,String gender);
	public List<Customer> findByNameOrCityOrGender(String name,String city,String gender);
	
	public List<Customer> findByNameAndCityAndGenderAndEmail(String name,String city,String gender,String email);
	public List<Customer> findByNameOrCityOrGenderOrEmail(String name,String city,String gender,String email);

	public List<Customer> findByOrderById();
	public List<Customer> findByOrderByName();
	public List<Customer> findByOrderByCity();
	public List<Customer> findByOrderByGender();
	
	public List<Customer> findByIdGreaterThan(int id);
	
	
}
