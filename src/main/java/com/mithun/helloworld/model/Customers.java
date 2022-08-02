package com.mithun.helloworld.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="customer",schema = "test1")
@Data
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String name;
    private long phone;

}
