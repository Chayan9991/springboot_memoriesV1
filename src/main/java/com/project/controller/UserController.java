package com.project.controller;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<?> userHome(){
        return new ResponseEntity<>("From User Home", HttpStatus.OK);
    }
}
