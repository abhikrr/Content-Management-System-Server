package com.abhisu.contentManagemetSystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @GetMapping("/page")
    public ResponseEntity<String> getPage(){
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
}
