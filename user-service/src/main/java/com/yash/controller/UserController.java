package com.yash.controller;

import com.yash.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("1", "Yash"),
                new User("2", "Mishra")
        );
    }
}
