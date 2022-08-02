package com.mithun.helloworld.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="order_item",schema = "test1")
@Data
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String qty;
    private int ordersId;
    private int productId;
}
