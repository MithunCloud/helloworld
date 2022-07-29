package com.mithun.helloworld.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    public List<String> getUsers(){

        return Arrays.asList("mithun","manoj");
    }
}
