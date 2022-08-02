package com.mithun.helloworld.controller;

import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @PostMapping
    public ResponseEntity<String> saveCustomers(@RequestBody WorldDto user){
        return new ResponseEntity<>(customersService.saveCustomers(user), HttpStatus.OK);
    }
}
