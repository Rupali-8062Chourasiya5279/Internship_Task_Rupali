package com.example.demo.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.productdao.ProductRepository;
import com.example.demo.productentity.Product;
@Service
public class ProductService {
	@Autowired
	private ProductRepository prepo ;

	public ProductService(ProductRepository prepo) {
		super();
		this.prepo = prepo;
	}
	public ProductService()
	{
		
	}
	public void addProduct(Product p)
	{
//		Product p = new Product("Laptop", "Lenovo", 60000, 12);
//		prepo.save(p);
//		System.out.println("product added succesfully");
		
		prepo.save(p);
		System.out.println("product added succesfully");
	}
	
	public List showProduct()
	{
		List<Product> ls = (List)prepo.findAll();
		return ls;
	}
	public void deleteproduct(int id) {
		
		prepo.deleteById(id);
		System.out.println("deleted");
	}
	

}
