package com.cap.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.Product;
import com.cap.service.ServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
	private ServiceImpl service;
	
	
	@PostMapping("/save")
	public Product save(@RequestBody Product p) throws Exception
	{
		return service.saveProduct(p);
	}
	
	@GetMapping("/all-product")
	public List<Product> getAllProduct() throws Exception
	{
		return service.findAllProduct();
	}
	
	@GetMapping("/get/{id}")
	public Product getByid(@PathVariable int id) throws Exception
	{
		return service.productbyId(id);
	}
	
	
	@PutMapping("/update/{id}")
	public Product updateProductbyId(@PathVariable  int id,@RequestBody Product p)
	{
		return service.updateProduct(id, p);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable  int id)
	{
		return service.deleteProduct(id);
	}

}
