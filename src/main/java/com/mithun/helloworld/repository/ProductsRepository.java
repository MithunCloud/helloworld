package com.mithun.helloworld.repository;

import com.mithun.helloworld.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer> {
}
