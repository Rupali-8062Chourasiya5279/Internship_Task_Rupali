package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.productservice;

@RestController
public class ProductController {
	
	@Autowired
	private productservice ps;
	
	public ProductController(productservice ps) {
		super();
		this.ps = ps;
	}


	@PostMapping("Product")
	public void addProduct(@RequestBody Product p)
	{
		ps.addproduct(p);	
	}
	

	@PostMapping("Product1")
	public void addProductm(@RequestBody ArrayList<Product> al)
	{
		
		ps.addproductm(al);	
	}
}
