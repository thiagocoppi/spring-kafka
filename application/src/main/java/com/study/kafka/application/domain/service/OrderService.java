package com.study.kafka.application.domain.service;

import com.study.kafka.application.domain.model.Order;

public interface OrderService {
    Order cadastrar(Order order);
}
