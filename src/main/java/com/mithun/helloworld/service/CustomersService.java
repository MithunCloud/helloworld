package com.mithun.helloworld.service;

import com.mithun.helloworld.dto.AddOrdersRequestDto;
import com.mithun.helloworld.repository.CustomersRepository;
import com.mithun.helloworld.dto.AddCustomersRequestDto;
import com.mithun.helloworld.dto.CustomersResponseDto;
import com.mithun.helloworld.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomersService {
    @Autowired
    private CustomersRepository customersDao;
    public CustomersResponseDto insertCustomers(AddCustomersRequestDto addCustomerRequestDto) {
        {
            Customer customer = new Customer();
            customer.setName(addCustomerRequestDto.getName());
            customer.setPhone(addCustomerRequestDto.getPhone());
            customer= customersDao.save(customer);
            return CustomersResponseDto.builder().id(customer.getId()).build();
        }
    }
    public CustomersResponseDto getCustomers() {
        List<Customer> customersList = new ArrayList<>();
        customersList =customersDao.findAll();
        return CustomersResponseDto.builder().customerList(customersList).build();
    }

    public Customer getCustomerId(AddOrdersRequestDto addOrdersRequestDto) {
        Customer customer = new Customer();
        customer = customersDao.getReferenceById(addOrdersRequestDto.getCustomerId());
        return customer;
    }
}
