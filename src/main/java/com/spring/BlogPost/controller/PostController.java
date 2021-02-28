package com.spring.BlogPost.controller;

import com.spring.BlogPost.model.Post;
import com.spring.BlogPost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.Date;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPost(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "posts";
    }

    @RequestMapping(method = RequestMethod.GET, value = "posts/newpost")
    public String newPost() {
        return "posts/create";
    }

    @RequestMapping(method = RequestMethod.POST, value = "posts/create")
    public String createNewPost(Post newPost) {
        PostService postService = new PostService();
        newPost.setDate(new Date());
        postService.createPost(newPost);
        return "redirect:/posts";
    }
}