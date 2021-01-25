package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAllByName(String name);

    @Query("Select user from User user where user.name = ?1")
    User findByName(String name);

    @Query("Select user from User user where user.userId = ?1")
    User findById(int id);
}
