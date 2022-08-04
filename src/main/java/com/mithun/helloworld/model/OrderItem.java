package com.mithun.helloworld.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="order_item",schema = "test1")
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="oi_id")
    private Integer id;
    @Column(name="oi_qty")
    private String qty;
    @ManyToOne
    @JoinColumn(name="oi_p_id",referencedColumnName = "p_id",nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name="oi_o_id",referencedColumnName = "o_id",nullable = false)
    private Order order;
}
