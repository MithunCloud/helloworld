package com.mithun.helloworld.repository;

import com.mithun.helloworld.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
