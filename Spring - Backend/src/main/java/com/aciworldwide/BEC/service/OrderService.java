package com.aciworldwide.BEC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.BEC.model.Order;
import com.aciworldwide.BEC.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;


	public List<Order> getOrder()
	{
		return repository.findAll();
	}

	public Order saveOrder(Order order)
	{
		return repository.save(order);

	}


}
