package com.aquiesce.demo.data;

import org.springframework.data.repository.CrudRepository;
import com.aquiesce.demo.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

    //Users findByLastName (String lastName);
}
