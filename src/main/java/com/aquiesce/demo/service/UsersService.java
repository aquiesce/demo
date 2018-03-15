package com.aquiesce.demo.service;

import com.aquiesce.demo.data.UsersRepository;
import com.aquiesce.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> GetAllUsers(){

        Iterable<Users> users = this.usersRepository.findAll();

        List<Users> list = new ArrayList<>();
        users.forEach(list::add);

        return list;

    }

    public Users GetUser(int id){

        //return this.usersRepository.findById(id);
        return this.usersRepository.findById(id).get();

    }
}
