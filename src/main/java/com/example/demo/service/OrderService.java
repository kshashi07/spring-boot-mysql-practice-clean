package com.example.demo.service;

import com.example.demo.entity.Order;

public interface OrderService {
    Order createOrder(Long userId, Order order);
}
