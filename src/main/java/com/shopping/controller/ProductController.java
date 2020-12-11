package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Product;
import com.shopping.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(productService.findAll(), HttpStatus.OK);
	}
	@GetMapping("/getProductById")
	public ResponseEntity<Product> getProductById(@RequestParam long id){
		return new ResponseEntity<Product>(productService.getById(id), HttpStatus.OK);
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.save(product), HttpStatus.OK);
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.update(product), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestParam  long id) {
		productService.delete(id);
		return "Deleted Successfully!!";
	}
	
	
	

}
