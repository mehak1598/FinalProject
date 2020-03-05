package com.aciworldwide.BEC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.BEC.model.Order;
import com.aciworldwide.BEC.service.OrderService;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/get")
	public List<Order> getOrder()
	{
		return orderService.getOrder();
	}

	@PostMapping("/save")
	public Order saveOrder(@RequestBody Order order){
		System.out.println(order);
		return orderService.saveOrder(order);

	}


}
