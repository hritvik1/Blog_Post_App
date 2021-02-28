package com.spring.BlogPost.service;

import com.spring.BlogPost.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(User user) {
        if(user.getUsername().equals("hritvik") && user.getPassword().equals("abc")) {
            return true;
        }
        else {
            return false;
        }
    }
}
