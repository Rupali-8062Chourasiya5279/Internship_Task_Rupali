package com.example.demo.productcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productservice.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	ProductService  ps = new ProductService();
	@RequestMapping("/addproduct")
	public String addproduct()
	{
		
		return "";
	}

}
