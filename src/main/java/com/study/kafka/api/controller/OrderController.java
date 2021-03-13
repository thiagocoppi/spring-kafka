package com.study.kafka.api.controller;

import com.study.kafka.api.model.CreateOrderDto;
import com.study.kafka.api.model.EditAdressDto;
import com.study.kafka.api.validators.EditAndressDtoValidator;
import com.study.kafka.entities.OrderProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/orders")
@Slf4j
public class OrderController {

    @Autowired
    private EditAndressDtoValidator editAndressDtoValidator;

    @InitBinder("editAdressDto")
    public void initMerchantOnlyBinder(WebDataBinder binder) {
        binder.addValidators(editAndressDtoValidator);
    }

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping(value = "/create")
    public ResponseEntity send(@Valid @RequestBody CreateOrderDto order) {
        orderProducer.send(null);
        return ResponseEntity.ok(order);
    }

    @PutMapping(value = "/edit")
    public ResponseEntity edit(@Valid @RequestBody EditAdressDto editAdress) {
        return ResponseEntity.ok(editAdress);
    }





}
