package com.spring.BlogPost.service;

import com.spring.BlogPost.model.Post;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class PostService {

    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory entityManagerFactory;

    public List<Post> getAllPosts() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Post> query = entityManager.createQuery("SELECT p from Post p", Post.class);
        List<Post> result = query.getResultList();
        return result;
    }

    public void createPost(Post newPost) {

    }
}