package com.twitterapi.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDTO loginDTO) {

        User user = authenticationService.loginUser(loginDTO.getUsernameOrEmail(), loginDTO.getPassword());
        if (user != null) {
            return ResponseEntity.ok("OK");
        } else {
            return (ResponseEntity) ResponseEntity.notFound();
        }

    }
}
