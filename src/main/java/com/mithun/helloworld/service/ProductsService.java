package com.mithun.helloworld.service;

import com.mithun.helloworld.dao.CustomersDao;
import com.mithun.helloworld.dao.ProductsDao;
import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.model.Customers;
import com.mithun.helloworld.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    private ProductsDao productsDao;
    public String saveProducts(WorldDto user) {
        {
            Products products = new Products();
            products.setName(user.getName());
            products.setDescription((user.getDescription()));
            productsDao.save(products);
            return ("Sucess");
        }
    }
}
