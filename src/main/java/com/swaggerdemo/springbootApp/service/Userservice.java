package com.swaggerdemo.springbootApp.service;


import com.swaggerdemo.springbootApp.resource.User;

import java.util.List;

public interface Userservice {
    User getUser(int id);

    List<User> getAllUsers();
}
