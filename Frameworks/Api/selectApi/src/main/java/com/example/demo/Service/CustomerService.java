package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.CustomerRepository;
import com.example.demo.Entity.Customer;

@Component
public class CustomerService {
	
	@Autowired
	private CustomerRepository cr;
	
	
	public List<Customer> show()
	{
		List<Customer> ls = cr.findAll();
		return ls;
	}
	
	public Customer showById(int id)
	{
		Optional<Customer> op = cr.findById(id);
		Customer ls = (Customer) op.get();
		return ls;
	}
	
	public List<Customer> showByName(String name)
	{
		List<Customer> ls=cr.findByName(name);
		return ls;
	}
	

	
	public List<Customer> showByGender(String gender)
	{
		List<Customer> ls=cr.findByGender(gender);
		return ls;
	}
	
	public List<Customer> showByOrderById()
	{
		List<Customer> ls=cr.findByOrderById();
		return ls;
	}
	
	
	public List<Customer> showGreaterById(int id)
	{
		List<Customer> ls=cr.findByIdGreaterThan(id);
		return ls;
	}
	
	public List<Customer> showByOrderByName()
	{
		List<Customer> ls=cr.findByOrderByName();
		return ls;
	}
	
	public List<Customer> showByOrderByGender()
	{
		List<Customer> ls=cr.findByOrderByGender();
		return ls;
	}
	
	public List<Customer> showByOrderByCity()
	{
		List<Customer> ls=cr.findByOrderByCity();
		return ls;
	}
	
	public List<Customer> showByCity(String city)
	{
		List<Customer> ls=cr.findByCity(city);
		return ls;
	}
	
	public List<Customer> showByEmail(String email)
	{
		List<Customer> ls = cr.findByEmail(email);
		return ls;
	}
	
	public List<Customer> showByNameAndGender(String name,String gender)
	{
		List<Customer> ls = cr.findByNameAndGender(name,gender);
		return ls;
	}
	
	public List<Customer> showByNameOrGender(String name,String gender)
	{
		List<Customer> ls = cr.findByNameOrGender(name,gender);
		return ls;
	}
	
	public List<Customer> showByNameAndCity(String name,String city)
	{
		List<Customer> ls = cr.findByNameAndCity(name,city);
		return ls ;
	}
	
	public List<Customer> showByNameOrCity(String name,String city)
	{
		List<Customer> ls = cr.findByNameOrCity(name,city);
		return ls ;
	}
	
	public List<Customer> showByNameOrEmail(String name ,String email)
	{
		List<Customer> ls = cr.findByNameOrEmail(name,email);
		return ls;
	}
	public List<Customer> showByNameAndEmail(String name ,String email)
	{
		List<Customer> ls = cr.findByNameAndEmail(name,email);
		return ls;
	}
	
	public List<Customer> showByCityAndGender(String city,String gender)
	{
		List<Customer> ls = cr.findByCityAndGender(city,gender);
		return ls;
	}
	
	public List<Customer> showByCityOrGender(String city,String gender)
	{
		List<Customer> ls = cr.findByCityOrGender(city,gender);
		return ls;
	}
	
	
	public List<Customer> showByNameAndPhone(String name ,String phone)
	{
		List<Customer> ls = cr.findByNameAndPhone(name,phone);
		return ls;
	}
	
	public List<Customer> showByNameOrPhone(String name ,String phone)
	{
		List<Customer> ls = cr.findByNameOrPhone(name,phone);
		return ls;
	}
	
	public List<Customer> showByNameCityGender(String name,String city,String gender)
	{
		List<Customer> ls = cr.findByNameAndCityAndGender(name,city,gender);
		return ls;
	}
	
	public List<Customer> showByNameCityGenderEmail(String name,String city,String gender,String email)
	{
		List<Customer> ls = cr.findByNameAndCityAndGenderAndEmail(name,city,gender,email);
		return ls;
	}
	
	public List<Customer> showByNameCityGenderEmailOr(String name,String city,String gender,String email)
	{
		List<Customer> ls = cr.findByNameOrCityOrGenderOrEmail(name,city,gender,email);
		return ls;
	}
	
	public List<Customer> showByNameCityGenderOr(String name,String city,String gender)
	{
		List<Customer> ls = cr.findByNameOrCityOrGender(name,city,gender);
		return ls;
	}
}
