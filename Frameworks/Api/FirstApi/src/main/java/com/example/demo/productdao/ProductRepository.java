package com.example.demo.productdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.productentity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
