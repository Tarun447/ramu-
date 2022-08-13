package com.cap.service;

import java.util.List;

import com.cap.entity.Product;

public interface ServiceDao {
	
	public Product saveProduct(Product p);
	
	public List<Product> findAllProduct();
	
	public Product productbyId(int id);
	
	public String deleteProduct(int id);
	
	public Product updateProduct(int id,Product p);
	

}
