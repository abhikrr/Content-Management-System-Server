package com.abhisu.contentManagemetSystem.controller;

import com.abhisu.contentManagemetSystem.dto.UserDto;
import com.abhisu.contentManagemetSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/getUsers")
    public ResponseEntity<List<UserDto>> getUsers(){
        ResponseEntity<List<UserDto>> entity = new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
        return entity;
    }


}
