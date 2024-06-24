package com.project.controller;

import com.project.entity.user.Posts;
import com.project.entity.user.User;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> userHome(){
        return new ResponseEntity<>("From User Home", HttpStatus.OK);
    }

    @PostMapping("/user/saveUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        try {
            User createdUser = userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/user/savePost")
    public ResponseEntity<String> createPost(@RequestBody Posts post, @RequestParam Long diaryId) {
        try {
            Posts createdPost = userService.createPost(diaryId, post);
            return ResponseEntity.status(HttpStatus.CREATED).body("Post Creation Successfull...");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // Or handle specific exception
        }
    }


}
