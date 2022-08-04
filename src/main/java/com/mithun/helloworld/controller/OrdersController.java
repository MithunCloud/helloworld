package com.mithun.helloworld.controller;

import com.mithun.helloworld.dto.AddOrdersRequestDto;
import com.mithun.helloworld.dto.OrdersResponseDto;
import com.mithun.helloworld.dto.ProductsResponseDto;
import com.mithun.helloworld.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping
    public ResponseEntity<OrdersResponseDto> insertOrders(@RequestBody AddOrdersRequestDto addOrdersRequestDto){
        return new ResponseEntity<>(ordersService.insertOrders(addOrdersRequestDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<OrdersResponseDto> getOrders(){
        return new ResponseEntity<>(ordersService.getOrders(), HttpStatus.OK);
    }
}
