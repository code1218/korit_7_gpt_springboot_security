package com.korit.springboot_security.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.korit.springboot_security.service.UserService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable int userId) throws NotFoundException, JsonProcessingException {
        return ResponseEntity.ok(userService.getUserById(userId));
    }
}







