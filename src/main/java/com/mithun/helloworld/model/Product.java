package com.mithun.helloworld.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="product",schema = "test1")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="p_id")
    private int id;
    @Column(name="p_name")
    private String name;
    @Column(name="p_description")
    private String description;
}
