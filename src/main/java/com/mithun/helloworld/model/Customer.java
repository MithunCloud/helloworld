package com.mithun.helloworld.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="customer",schema = "test1")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="c_id")
    private Integer id;
    @Column(name="c_name")
    private String name;
    @Column(name="c_phone")
    private Double phone;
}
