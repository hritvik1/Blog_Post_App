package com.spring.BlogPost.controller;

import com.spring.BlogPost.model.User;
import com.spring.BlogPost.service.PostService;
import com.spring.BlogPost.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

    private UserService userService = new UserService();
    private PostService postService = new PostService();

    @RequestMapping(method = RequestMethod.GET, value = "/users/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "users/login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/login")
    public String loginUser(User user) {
        if(userService.login(user)) {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/registration")
    public String Registration() {
        return "users/registration";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/registration")
    public String userRegistration(User user) {
        return "redirect:/users/login";
    }

    @RequestMapping(value = "/users/logout")
    public String userLogout() {
        return "redirect:/";
    }
}