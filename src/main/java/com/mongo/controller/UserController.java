package com.mongo.controller;

import com.mongo.model.UserModel;
import com.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    // getAll
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<UserModel> allUser=userService.getAllUser();
        if(!allUser.isEmpty()){
            return ResponseEntity.ok(allUser);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not fetched all users");
        }
    }

    // insert

    @PostMapping("/post")
    public ResponseEntity<String>insert(@RequestBody UserModel userModel){
        UserModel user=userService.insertUser(userModel);
        if(user!=null){
            return ResponseEntity.ok("inserted");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not inserted");
        }
    }



}
