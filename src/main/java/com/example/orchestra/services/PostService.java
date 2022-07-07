package com.example.orchestra.services;

import com.example.orchestra.entities.Post;

import java.util.List;


public interface PostService {

    void deleteById(Long id);

    Post updatePost(Post post);

    public List<Post> getAllPosts();

//    public void insert(Post post);

    Post findPostById(Long id);

    Post savePost(Post post);
}
