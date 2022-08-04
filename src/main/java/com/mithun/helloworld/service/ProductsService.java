package com.mithun.helloworld.service;

import com.mithun.helloworld.dto.AddOrdersRequestDto;
import com.mithun.helloworld.dto.AddProductsRequestDto;
import com.mithun.helloworld.dto.ProductsResponseDto;
import com.mithun.helloworld.model.Product;
import com.mithun.helloworld.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsDao;

    public ProductsResponseDto insertProducts(AddProductsRequestDto addProductsRequestDto) {
        {
            Product product = new Product();
            product.setName(addProductsRequestDto.getName());
            product.setDescription((addProductsRequestDto.getDesc()));
            product= productsDao.save(product);
            return ProductsResponseDto.builder().id(product.getId()).build();
        }
    }

    public ProductsResponseDto getProducts() {
        List<Product> productsList = new ArrayList<>();
        productsList =productsDao.findAll();
        return ProductsResponseDto.builder().productList(productsList).build();
    }

    public Product getProductId(AddOrdersRequestDto addOrdersRequestDto) {
        Product product = productsDao.getReferenceById(addOrdersRequestDto.getProductId());
        return product;
    }
}
