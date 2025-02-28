package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	public CustomerController(CustomerService cs)
	{
		System.out.println("customer controller constructor called");
		this.cs = cs;
	}
	
	@GetMapping("customer")
	public List<Customer> customer()
	{
		List<Customer> ls = cs.show();
		return ls;
	}
	
	@GetMapping("customer/{id}")
	public Customer customer1(@PathVariable(value = "id") int id)
	{
		Customer ls = cs.showById(id);
		return ls ;
	}
	
	@GetMapping("customer1/{name}")
	public List<Customer> customer2(@PathVariable(value = "name") String name)
	{
		List<Customer> ls = cs.showByName(name);
		return ls;
	}

	
	@GetMapping("customer2/{gender}")
	public List<Customer> customer3(@PathVariable(value = "gender") String gender)
	{
		List<Customer> ls = cs.showByGender(gender);
		return ls;
	}
	
	@GetMapping("customer23")
	public List<Customer> customer23()
	{
		List<Customer> ls = cs.showByOrderById();
		return ls;
	}
	
	@GetMapping("customer27/{id}")
	public List<Customer> customer27(@PathVariable(value="id") int id)
	{
		List<Customer> ls = cs.showGreaterById(id);
		return ls;
	}
	
	@GetMapping("customer24")
	public List<Customer> customer24()
	{
		List<Customer> ls = cs.showByOrderByName();
		return ls;
	}
	
	@GetMapping("customer25")
	public List<Customer> customer25()
	{
		List<Customer> ls = cs.showByOrderByGender();
		return ls;
	}
	
	@GetMapping("customer26")
	public List<Customer> customer26()
	{
		List<Customer> ls = cs.showByOrderByCity();
		return ls;
	}
	
	@GetMapping("customer3/{city}")
	public List<Customer> customer4(@PathVariable(value = "city") String city)
	{
		List<Customer> ls = cs.showByCity(city);
		return ls;
	}
	
	@GetMapping("customer4/{email}")
	public List<Customer> customer5(@PathVariable(value = "email") String email)
	{
		List<Customer> ls = cs.showByEmail(email);
		return ls;
	}
	
	@GetMapping("customer5/{name}/{gender}")
	public List<Customer> customer6(@PathVariable(value="name") String name,
									@PathVariable(value="gender") String gender)
	{
		List<Customer> ls=cs.showByNameAndGender(name,gender);
		return ls;
	}
	
	@GetMapping("customer11/{name}/{gender}")
	public List<Customer> customer11(@PathVariable(value="name") String name,
									@PathVariable(value="gender") String gender)
	{
		List<Customer> ls=cs.showByNameOrGender(name,gender);
		return ls;
	}
	
	@GetMapping("customer/{name}/{city}")
	
	public List<Customer> customer(@PathVariable(value="name") String name,
									@PathVariable(value="city") String city)
	{
	List<Customer> ls = cs.showByNameAndCity(name,city);
	return ls;
	}
	
	@GetMapping("customer12/{name}/{city}")
	
	public List<Customer> customer12(@PathVariable(value="name") String name,
									@PathVariable(value="city") String city)
	{
	List<Customer> ls = cs.showByNameOrCity(name,city);
	return ls;
	}
	
	
	
	@GetMapping("customer6/{name}/{email}")
	
	public List<Customer> customer7(@PathVariable(value="name") String name,
									@PathVariable(value="email") String email)
	{
		List<Customer> ls = cs.showByNameAndEmail(name,email);
		return ls;
	}
	
	@GetMapping("customer13/{name}/{email}")
	
	public List<Customer> customer13(@PathVariable(value="name") String name,
									@PathVariable(value="email") String email)
	{
		List<Customer> ls = cs.showByNameOrEmail(name,email);
		return ls;
	}
	
	@GetMapping("customer7/{city}/{gender}")
	public List<Customer> customer8(@PathVariable(value = "city") String city,
									@PathVariable(value="gender") String gender)
	{
		List<Customer> ls= cs.showByCityAndGender(city,gender);
		return ls;
	}
	
	@GetMapping("customer14/{city}/{gender}")
	public List<Customer> customer14(@PathVariable(value = "city") String city,
									@PathVariable(value="gender") String gender)
	{
		List<Customer> ls= cs.showByCityOrGender(city,gender);
		return ls;
	}
	
	@GetMapping("customer8/{name}/{phone}")
	public List<Customer> customer9(@PathVariable(value = "name") String name,
									@PathVariable(value="phone") String phone)
	{
		List<Customer> ls= cs.showByNameAndPhone(name,phone);
		return ls;
	}
	
	@GetMapping("customer15/{name}/{phone}")
	public List<Customer> customer15(@PathVariable(value = "name") String name,
									@PathVariable(value="phone") String phone)
	{
		List<Customer> ls= cs.showByNameOrPhone(name,phone);
		return ls;
	}
	
	@GetMapping("customer/{name}/{city}/{gender}")
	public List<Customer> customer (@PathVariable(value = "name")String name,
									@PathVariable(value = "city") String city,
									@PathVariable(value = "gender") String gender)
	{
		List<Customer> ls = cs.showByNameCityGender(name,city,gender);
		return ls;
	}
	
	@GetMapping("customer9/{name}/{city}/{gender}")
	public List<Customer> customer9 (@PathVariable(value = "name")String name,
									@PathVariable(value = "city") String city,
									@PathVariable(value = "gender") String gender)
	{
		List<Customer> ls = cs.showByNameCityGenderOr(name,city,gender);
		return ls;
	}
	
	@GetMapping("customer21/{name}/{city}/{gender}/{email}")
	public List<Customer> customer21 (@PathVariable(value = "name")String name,
									@PathVariable(value = "city") String city,
									@PathVariable(value = "gender") String gender,
									@PathVariable(value = "email") String email)
	{
		List<Customer> ls = cs.showByNameCityGenderEmail(name,city,gender,email);
		return ls;
	}
	
	@GetMapping("customer22/{name}/{city}/{gender}/{email}")
	public List<Customer> customer22 (@PathVariable(value = "name")String name,
									@PathVariable(value = "city") String city,
									@PathVariable(value = "gender") String gender,
									@PathVariable(value = "email") String email)
	{
		List<Customer> ls = cs.showByNameCityGenderEmailOr(name,city,gender,email);
		return ls;
	}
}
