package com.fproject.controller;

import com.fproject.model.UsersModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsersController {

    // Endpoint to get the signup form with required fields (sent as JSON)
    @GetMapping("/signup")
    public ResponseEntity<Object> getSignupPage() {
        // Return JSON structure that describes the required fields for signup
        return ResponseEntity.ok().body(
                new String[] {"login", "password", "email"} // Example fields for signup
        );
    }

    // Endpoint to handle the signup form submission
    @PostMapping("/signup")
    public ResponseEntity<String> submitSignup(@RequestBody UsersModel user) {
        // Logic to handle the signup (e.g., saving the user to the database)
        // For testing purposes, just return the received data.
        return ResponseEntity.ok("Signup successful for: " + user.getLogin());
    }

    // Endpoint to get the login form with required fields (sent as JSON)
    @GetMapping("/login")
    public ResponseEntity<Object> getLoginPage() {
        // Return JSON structure that describes the required fields for login
        return ResponseEntity.ok().body(
                new String[] {"login", "password"} // Example fields for login
        );
    }

    // Endpoint to handle the login form submission
    @PostMapping("/login")
    public ResponseEntity<String> submitLogin(@RequestBody UsersModel user) {
        // Logic to handle login (e.g., verifying the user's credentials)
        // For testing purposes, just return the received login.
        return ResponseEntity.ok("Login successful for: " + user.getLogin());
    }
}
