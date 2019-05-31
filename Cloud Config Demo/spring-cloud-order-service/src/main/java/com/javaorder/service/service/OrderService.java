package com.javaorder.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaorder.service.bean.Order;

@Service
public interface OrderService {

	public Order saveOrder(Order order);

	public List<Order> getAllOrder();

	public Order getOrderById(Integer orderId);

	public Order updateOrderQty(Integer orderId, Integer quantity, Integer orderItemId);
}
