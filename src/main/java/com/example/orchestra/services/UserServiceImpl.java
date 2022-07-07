package com.example.orchestra.services;


import com.example.orchestra.entities.User;
import com.example.orchestra.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {

        User newUser = userRepository.getById(user.getId());

        newUser .setUserName(user.getUserName());
        newUser.setPassword(user.getPassword());
        newUser .setRoles(user.getRoles());

        user = userRepository.save(newUser);

        return user;
    }

    @Override
    public User updateUserRole(User user) {
        return null;
    }
}
