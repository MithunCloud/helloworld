package com.mithun.helloworld.controller;

import com.mithun.helloworld.dto.AddProductsRequestDto;
import com.mithun.helloworld.dto.ProductsResponseDto;
import com.mithun.helloworld.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping
    public ResponseEntity<ProductsResponseDto> insertProducts(@RequestBody AddProductsRequestDto addProductsRequestDto){
        return new ResponseEntity<>(productsService.insertProducts(addProductsRequestDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ProductsResponseDto> getProducts(){
        return new ResponseEntity<>(productsService.getProducts(), HttpStatus.OK);
    }
}
