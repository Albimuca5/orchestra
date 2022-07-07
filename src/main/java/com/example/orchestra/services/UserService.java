package com.example.orchestra.services;


import com.example.orchestra.entities.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

    User findUserById(Long id);

    void deleteById(Long id);

    User updateUser(User user);

    User updateUserRole(User user);

}
