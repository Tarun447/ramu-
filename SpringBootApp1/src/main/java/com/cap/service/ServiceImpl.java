package com.cap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.entity.Product;
import com.cap.repository.ProductRepository;


@Service
public class ServiceImpl implements ServiceDao {
	
	@Autowired
	private ProductRepository repo ;

	@Override
	public Product saveProduct(Product p) {
		
		return repo.save(p);
	}

	@Override
	public List<Product> findAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public Product productbyId(int id) {
       Optional<Product>  p = repo.findById(id);
       
       if(p.isPresent())
       {
    	   return p.get();
       }
        
		return null;
	}

	@Override
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Record has been Deleted successfully";
	}

	@Override
	public Product updateProduct(int id,Product p) {
		Optional<Product>  pd = repo.findById(id);
		Product product = pd.get();
		product.setProdName(p.getProdName());
		product.setProdColor(p.getProdColor());
		product.setProdCost(p.getProdCost());
		
		
		
		return repo.save(product);
	}

}
