package com.swaggerdemo.springbootApp.controller;

import com.swaggerdemo.springbootApp.resource.User;
import com.swaggerdemo.springbootApp.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Userservice userservice;

    @GetMapping(value="{id}")
    public ResponseEntity getUser(@PathVariable("id")int id){
        return new ResponseEntity(userservice.getUser(id), HttpStatus.OK);
    }

    @GetMapping(value="/user/")
    public ResponseEntity getUser(){

        List<User> users=userservice.getAllUsers();
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
