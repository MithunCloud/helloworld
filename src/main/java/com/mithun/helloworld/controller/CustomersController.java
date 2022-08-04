package com.mithun.helloworld.controller;

import com.mithun.helloworld.dto.AddCustomersRequestDto;
import com.mithun.helloworld.dto.CustomersResponseDto;
import com.mithun.helloworld.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @PostMapping
    public ResponseEntity<CustomersResponseDto> insertCustomers(@RequestBody AddCustomersRequestDto addCustomerRequestDto){
        return new ResponseEntity<>(customersService.insertCustomers(addCustomerRequestDto), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<CustomersResponseDto> getCustomers(){
        return new ResponseEntity<>(customersService.getCustomers(), HttpStatus.OK);
    }
}
