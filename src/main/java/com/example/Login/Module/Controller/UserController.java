package com.example.Login.Module.Controller;

import com.example.Login.Module.Entity.User;
import com.example.Login.Module.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/testing")
    @ResponseBody
    public String test()
    {
        return userService.testingService();
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user)
    {
        userService.registerUser(user);

        return "Registered Successfully!";
    }
    @GetMapping("/dashboard")
    public String dashboard()
    {
        return "dashboard";
    }
}