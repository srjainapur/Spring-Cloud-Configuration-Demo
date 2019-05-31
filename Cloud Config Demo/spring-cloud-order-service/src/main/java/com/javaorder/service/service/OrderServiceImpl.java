package com.javaorder.service.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javaorder.service.bean.Order;
import com.javaorder.service.bean.OrderItem;
import com.javaorder.service.repository.OrderRepository;

@Service
@Qualifier("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@Override
	public Order getOrderById(Integer orderId) {
		return orderRepository.findById(orderId).get();
	}

	@Override
	public Order updateOrderQty(Integer orderId, Integer quantity, Integer orderItemId) {
		Order existingOrder = orderRepository.getOne(orderId);
		if(existingOrder != null) {
			List<OrderItem> orderItems = existingOrder.getOrderItems();
			System.out.println("Size of old List " + orderItems.size());
			OrderItem matchOrderItem = orderItems.stream().filter(o -> o.getId() == orderItemId).findFirst().get();
			List<OrderItem> newOrderItems = orderItems.stream().filter(o -> o.getId() != orderItemId).collect(Collectors.toList());
			System.out.println("Size of new List " + newOrderItems.size());					
			matchOrderItem.setQuantity(quantity);
			matchOrderItem.setPrice(matchOrderItem.getPrice() * quantity);
			newOrderItems.add(matchOrderItem);
			existingOrder.setOrderItems(newOrderItems);
			
			return orderRepository.save(existingOrder);
		} else {
			return existingOrder;
		}
	}
}
