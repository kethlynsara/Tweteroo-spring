package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.model.User;
import com.tweteroo.api.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
public class UserController {
    
    @Autowired
    private UserRepository repository;
    
    @PostMapping
    public void signUp(@RequestBody @Valid UserDTO req) {
        repository.save(new User(req));
    }
}
