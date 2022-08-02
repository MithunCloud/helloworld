package com.mithun.helloworld.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="product",schema = "test1")
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String name;
    private String description;
}
