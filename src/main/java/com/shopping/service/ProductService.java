package com.shopping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.model.Product;
import com.shopping.repo.ProductRepo;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> findAll(){
		return productRepo.findAll();
	}
	
	public Product getById(long id) {
		return productRepo.findById(id).get();
	}
	
	public Product save(Product product) {
		return productRepo.save(product);
	}
	
	public Product update(Product product) {
		return productRepo.save(product);
	}
	
	public void delete(long id) {
		 productRepo.deleteById(id);
	}
	
	
	

}
