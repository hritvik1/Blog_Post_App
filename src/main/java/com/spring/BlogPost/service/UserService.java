package com.spring.BlogPost.service;

import com.spring.BlogPost.model.User;
import com.spring.BlogPost.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(User user) {
        if(user.getUsername().equals("hritvik") && user.getPassword().equals("abc")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void registerUser(User newUser) {
        userRepository.registerUser(newUser);
    }
}
