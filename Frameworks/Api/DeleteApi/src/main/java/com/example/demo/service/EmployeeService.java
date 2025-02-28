package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;

@Component
public class EmployeeService {
	
	@Autowired 
	private EmployeeRepository er;

	public void deleteById(int id) {
		er.deleteById(id);
		System.out.println("deleted");
		
	}
	
	public void deleteCity(String city)
	{
		System.out.println(city);
		er.deleteByCity(city);
	}



	public void deleteByDept(String dept) {
		// TODO Auto-generated method stub
		
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBySalary(double salary) {
		// TODO Auto-generated method stub
		
	}

	


	
	
}
