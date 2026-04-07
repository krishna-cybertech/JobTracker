package com.JobTracker.Controller;

import com.JobTracker.Entity.User;
import com.JobTracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

//    @PostMapping("/register")
//    public User register(@RequestBody User user) {
//        return userService.register(user);
//    }
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        System.out.println(user);
        return userService.register(user);
    }
}