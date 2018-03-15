package com.aquiesce.demo.controller;

import com.aquiesce.demo.model.Users;
import com.aquiesce.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserServiceController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<Users> getAllUsers(){

        return this.usersService.GetAllUsers();
    }
}
