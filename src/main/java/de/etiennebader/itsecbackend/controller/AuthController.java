package de.etiennebader.itsecbackend.controller;

import de.etiennebader.itsecbackend.entity.User;
import de.etiennebader.itsecbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public ResponseEntity<String> testAuth() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        if (userService.createUser(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhone(), user.getAddress())) {
            return ResponseEntity.ok("User registered successfully");
        }
        return ResponseEntity.status(500).body("Something went wrong");
    }

    @GetMapping("/getUserByUsername/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}
