package com.mithun.helloworld.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="order",schema = "test1")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="o_id")
    private Integer id;
    @Column(name="o_date_time")
    private LocalDateTime dateTime;
    @ManyToOne
    @JoinColumn(name="o_c_id",referencedColumnName = "c_id",nullable = false)
    private Customer customer;
}
