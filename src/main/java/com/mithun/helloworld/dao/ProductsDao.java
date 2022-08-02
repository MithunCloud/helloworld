package com.mithun.helloworld.dao;

import com.mithun.helloworld.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDao extends JpaRepository<Products,Integer> {
}
