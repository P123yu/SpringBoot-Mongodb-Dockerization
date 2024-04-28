package com.mongo.service;

import com.mongo.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    // getAllUser
    List<UserModel> getAllUser();

    // insert User
    UserModel insertUser(UserModel userModel);
}
