package com.mithun.helloworld.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="order",schema = "test1")
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    private String orderTiming;
    @ManyToOne
    @JoinColumn(name="customers_id",referencedColumnName = "customers_id",nullable = false)
    private Customers customers;
}
