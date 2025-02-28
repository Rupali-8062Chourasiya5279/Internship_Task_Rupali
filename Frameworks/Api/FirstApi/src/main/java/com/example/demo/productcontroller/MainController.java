package com.example.demo.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productentity.Product;
import com.example.demo.productservice.ProductService;


//@Controller
//public class MainController {
//	@ResponseBody
//	@RequestMapping("home")
//	public String home()
//	{
//		return "hello home";
//	}
//	
//}

@RestController
public class MainController {
	@Autowired
	private ProductService ps ;
	
	
	public MainController(ProductService ps) {
		super();
		this.ps = ps;
	}



	@RequestMapping("home")
	public String home()
	{
		return "hello home";
	}
	
	
		
		@PostMapping("product")
		public String addproduct()
		{
			Product p =new Product("Laptop", "Hp", 50000, 5);
			ps.addProduct(p);
			return "addsuccessfully";
		}
		
		
		@GetMapping("product")
		public List showproduct()
		{
			List<Product> ls= ps.showProduct();
			return ls;
		}
		
		@DeleteMapping("product")
		public String deleteproduct()
		{
			int id=1 ;
			ps.deleteproduct(id);
			return "deleted";
		}
		
}

