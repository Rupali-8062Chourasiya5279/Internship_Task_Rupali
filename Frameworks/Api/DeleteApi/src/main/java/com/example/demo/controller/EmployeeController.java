package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	public EmployeeController(EmployeeService es) {
		super();
		this.es = es;
	}



	@DeleteMapping("Employee/{id}")
	public  void empid(@PathVariable(value = "id")int id)
	{
		es.deleteById(id);
	}
	
	@DeleteMapping("employee1/{city}")
	public  String empcity(@PathVariable String city)
	{
		System.out.println(city);
		es.deleteCity(city);
		return "deleted";
	}
	
	@DeleteMapping("Employee2/{name}")
	public  void empname(@PathVariable(value = "id")String name)
	{
		es.deleteByName(name);
	}
	
	@DeleteMapping("Employee3/{dept}")
	public  void empdept(@PathVariable(value = "id")String dept)
	{
		es.deleteByDept(dept);
	}
	
	@DeleteMapping("Employee4/{sal}")
	public  void empsal(@PathVariable(value = "id")double salary)
	{
		es.deleteBySalary(salary);
	}

}
