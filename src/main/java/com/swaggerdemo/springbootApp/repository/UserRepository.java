package com.swaggerdemo.springbootApp.repository;

import com.swaggerdemo.springbootApp.resource.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
