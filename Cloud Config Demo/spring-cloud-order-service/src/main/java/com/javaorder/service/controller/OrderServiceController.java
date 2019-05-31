package com.javaorder.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaorder.service.bean.Order;
import com.javaorder.service.service.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderServiceController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Order> getAllOrder() {
		return orderService.getAllOrder();
	}
	
	@RequestMapping(value="/getOrderById/{id}", method=RequestMethod.GET)
	public Order getOrderById(@PathVariable("id") Integer orderId) {
		return orderService.getOrderById(orderId);
	}
	
	@RequestMapping(value="/updateQty/{id}/{qty}/{orderItemId}")
	public Order updateOrderQty(@PathVariable("id") Integer orderId, 
			@PathVariable("qty") Integer quantity, 
			@PathVariable("orderItemId") Integer orderItemId) {
		return orderService.updateOrderQty(orderId, quantity, orderItemId);
	}
}
