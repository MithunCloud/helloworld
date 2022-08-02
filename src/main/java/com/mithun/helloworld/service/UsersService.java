package com.mithun.helloworld.service;

import com.mithun.helloworld.dao.UsersDao;
import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    public String saveUsers(WorldDto user) {
        Users users = new Users();
        users.setName(user.getName());
        users.setDept(user.getDept());
     usersDao.save(users);
     return ("Sucess");
    }

    public List<Users> getUsers() {
       List<Users> us =usersDao.findAll();
         return us;
    }

    public Users getUserById(String id) {
        Users us = usersDao.getReferenceById(Integer.parseInt(id));
        return us;
    }
}
