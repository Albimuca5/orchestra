package com.example.orchestra.services;

import com.example.orchestra.entities.Post;
import com.example.orchestra.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post updatePost(Post post) {
        Post newPost = postRepository.getById(post.getId());

        newPost.setTitle(post.getTitle());
        newPost.setBody(post.getBody());
        newPost.setSubject(post.getSubject());
        newPost.setOrderId(post.getOrderId());
        newPost.setUrlButton(post.getUrlButton());
        newPost.setDateCreated(post.getDateCreated());
        newPost.setStatus(post.getStatus());
        newPost.setPhoto(post.getPhoto());

        post = postRepository.save(newPost);
        return post;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

//    @Override
//    public void insert(Post post) {
//        postRepository.save(post);
//    }

    @Override
    public Post findPostById(Long id) {
        return postRepository.getById(id);
    }


}
