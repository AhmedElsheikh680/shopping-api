package com.shopping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.model.Order;
import com.shopping.repo.OrderRepo;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	public List<Order> findAll(){
		return orderRepo.findAll();
	}
	
	public Order getById(long id) {
		return orderRepo.findById(id).get();
		
	}
	
	public Order save(Order order) {
		return orderRepo.save(order);
	}
	
	public Order update(Order order) {
		return orderRepo.save(order);
	}
	
	public void delete(long id) {
		 orderRepo.deleteById(id);
	}
	
	
	

}
