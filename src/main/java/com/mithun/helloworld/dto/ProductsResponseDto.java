package com.mithun.helloworld.dto;

import com.mithun.helloworld.model.Product;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ProductsResponseDto {
    private Integer id;
    private String name;
    private String desc;
    private List<Product> productList;
}
