package com.mithun.helloworld.service;

import com.mithun.helloworld.dao.CustomersDao;
import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    @Autowired
    private CustomersDao customersDao;
    public String saveCustomers(WorldDto user) {
        {
            Customers customers = new Customers();
            customers.setName(user.getName());
            customers.setPhone(user.getPhone());
            customersDao.save(customers);
            return ("Sucess");
        }
    }
}
