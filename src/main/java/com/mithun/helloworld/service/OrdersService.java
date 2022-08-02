package com.mithun.helloworld.service;

import com.mithun.helloworld.dao.CustomersDao;
import com.mithun.helloworld.dao.OrdersDao;
import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.model.Customers;
import com.mithun.helloworld.model.Orders;
import com.mithun.helloworld.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    public  String insertOrders(WorldDto worldDto) {
        String result ="failed";
        Orders orders = new Orders();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = (dtf.format(now));
        orders.setOrderTiming(date);
//        orders.setCustomerId( worldDto.getCustomerId());
        ordersDao.save(orders);
        result="success";
        return result;

    }
}
