package com.mithun.helloworld.service;

import com.mithun.helloworld.dao.UsersDao;
import com.mithun.helloworld.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    public List<String> getUsers(){

        return Arrays.asList("mithun","manoj");
    }

    public String saveUsers(Users user) {
     usersDao.save(user);
     return ("Sucess");
    }
}
