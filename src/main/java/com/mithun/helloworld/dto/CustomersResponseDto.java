package com.mithun.helloworld.dto;

import com.mithun.helloworld.model.Customer;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Builder
@Getter
public class CustomersResponseDto {
    private Integer id;
    private String name;
    private Double phone;
    private List<Customer> customerList;
}
