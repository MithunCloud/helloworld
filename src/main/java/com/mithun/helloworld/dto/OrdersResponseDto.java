package com.mithun.helloworld.dto;

import com.mithun.helloworld.model.Order;
import com.mithun.helloworld.model.OrderItem;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class OrdersResponseDto {
    private Integer id;
    private LocalDateTime dateTime;
    private Integer customerId;
    private String qty;
    private Integer productId;
    private Integer OrderId;
    private String customerName;
    private String productName;
    private List<Order> orderList;
    private List<OrderItem> orderItemList;
}
