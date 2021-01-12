package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(int id){
        userRepository.deleteById(id);
    }
}
