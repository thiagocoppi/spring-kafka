package com.study.kafka.domain.service;

import com.study.kafka.domain.model.Order;

public interface OrderService {
    Order cadastrar(Order order);
}
