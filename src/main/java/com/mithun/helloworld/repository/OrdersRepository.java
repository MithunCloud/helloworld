package com.mithun.helloworld.repository;

import com.mithun.helloworld.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Order,Integer> {
}
