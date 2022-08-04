package com.mithun.helloworld.service;

import com.mithun.helloworld.dto.AddOrdersRequestDto;
import com.mithun.helloworld.dto.OrdersResponseDto;
import com.mithun.helloworld.model.Customer;
import com.mithun.helloworld.model.Order;
import com.mithun.helloworld.model.OrderItem;
import com.mithun.helloworld.model.Product;
import com.mithun.helloworld.repository.OrderItemsRepository;
import com.mithun.helloworld.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersDao;

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    @Autowired
    private CustomersService customersService;

    @Autowired
    private ProductsService productsService;

    public OrdersResponseDto insertOrders(AddOrdersRequestDto addOrdersRequestDto) {
        Order order = new Order();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        order.setDateTime(now);
        Customer customer = customersService.getCustomerId(addOrdersRequestDto);
        order.setCustomer(customer);
        order= ordersDao.save(order);
        OrderItem orderItem = new OrderItem();
        orderItem.setQty(addOrdersRequestDto.getQty());
        Product product = productsService.getProductId(addOrdersRequestDto);
        orderItem.setOrder(order);
        orderItem.setProduct(product);
        orderItemsRepository.save(orderItem);
        return OrdersResponseDto.builder().id(order.getId()).build();
    }

    public OrdersResponseDto getOrders() {
        List<Order> orderList = ordersDao.findAll();
        List<OrderItem> orderItemList=orderItemsRepository.findAll();
        return OrdersResponseDto.builder().orderList(orderList).orderItemList(orderItemList).build();
    }
}
