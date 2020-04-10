package com.swaggerdemo.springbootApp.service;

import com.swaggerdemo.springbootApp.repository.UserRepository;
import com.swaggerdemo.springbootApp.resource.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElseGet(null);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
