package com.mithun.helloworld.dao;

import com.mithun.helloworld.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;

@Repository
public interface CustomersDao extends JpaRepository<Customers,Integer> {
}
