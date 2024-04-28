package com.mongo.service;

import com.mongo.model.UserModel;
import com.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserModel> getAllUser() {
        List<UserModel> allUser=userRepository.findAll();
        return allUser;
    }

    @Override
    public UserModel insertUser(UserModel userModel) {
        UserModel user=userRepository.save(userModel);
        return user;
    }
}
