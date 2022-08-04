package com.mithun.helloworld.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AddOrdersRequestDto {
    private LocalDateTime dateTime;
    private Integer customerId;
    private String qty;
    private Integer productId;
    private Integer OrderId;

}
