package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ProductRepository;
import com.example.demo.entity.Product;

@Component
public class productservice {
	
	@Autowired
	private ProductRepository pr;
	
	public void addproduct(Product p)
	{
		pr.save(p);
		System.out.println("saved");
	}

	public void addproductm(ArrayList<Product> al) {
		pr.saveAll(al);
		System.out.println("saved");
		
	}
	

	
}
