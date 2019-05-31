package com.javaorder.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaorder.service.bean.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
