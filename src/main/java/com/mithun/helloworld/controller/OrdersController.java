package com.mithun.helloworld.controller;

import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping
    public ResponseEntity<String> insertOrders(@RequestBody WorldDto worldDto){
        return new ResponseEntity<>(ordersService.insertOrders(worldDto), HttpStatus.OK);
    }
}
