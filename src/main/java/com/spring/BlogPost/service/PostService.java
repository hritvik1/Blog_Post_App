package com.spring.BlogPost.service;

import com.spring.BlogPost.model.Post;
import com.spring.BlogPost.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    public void createPost(Post newPost) {
        postRepository.createPost(newPost);
    }

    public void deletePost(Integer postId) {
        postRepository.deletePost(postId);
    }
}