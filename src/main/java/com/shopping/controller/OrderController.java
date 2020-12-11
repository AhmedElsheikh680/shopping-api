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

import com.shopping.model.Order;
import com.shopping.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getAllOrders")
	public ResponseEntity<List<Order>> getAllOrders(){
		return new ResponseEntity<List<Order>>(orderService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("getOrderById")
	public ResponseEntity<Order> getOrderById(@RequestParam long id){
		
		return new ResponseEntity<Order>(orderService.getById(id), HttpStatus.OK);
	}
	
	@PostMapping("/addOrder")
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(orderService.save(order), HttpStatus.OK);
	}
	
	@PutMapping("/updateOrder")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(orderService.update(order), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteOrder")
	public String deleteOrder(@RequestParam long id) {
		orderService.delete(id);
		return  "Deleted Successfully!!";
	}
	
	
	
	
}
