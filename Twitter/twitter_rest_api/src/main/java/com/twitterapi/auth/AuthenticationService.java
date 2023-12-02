package com.twitterapi.auth;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    AuthenticationRepository authenticationRepository;

    public User loginUser(String username, String password) {
        Optional<User> user = authenticationRepository.findUserByUsername(username, password);
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }
}
