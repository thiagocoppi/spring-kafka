package com.study.kafka.application.domain.service.impl;

import com.study.kafka.application.domain.model.Order;
import com.study.kafka.application.domain.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order cadastrar(Order order) {
        return new Order();
    }
}
