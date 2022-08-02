package com.mithun.helloworld.controller;

import com.mithun.helloworld.dto.WorldDto;
import com.mithun.helloworld.model.Users;
import com.mithun.helloworld.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public ResponseEntity <String> saveUsers(@RequestBody WorldDto user){
        return new ResponseEntity<>(usersService.saveUsers(user),HttpStatus.OK);
    }
//    @GetMapping
//    public ResponseEntity<List<Users>> getUsers(){
//        return new ResponseEntity<>(usersService.getUsers(),HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<Users> getUserById( @RequestParam String id){
        return new ResponseEntity<>(usersService.getUserById(id),HttpStatus.OK);
    }
}
