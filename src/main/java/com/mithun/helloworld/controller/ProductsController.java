package com.mithun.helloworld.controller;

import com.mithun.helloworld.dao.ProductsDao;
import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping
    public ResponseEntity<String> saveProducts(@RequestBody WorldDto user){
        return new ResponseEntity<>(productsService.saveProducts(user), HttpStatus.OK);
    }
}
