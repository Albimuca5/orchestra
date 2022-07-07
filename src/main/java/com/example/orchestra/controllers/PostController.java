package com.example.orchestra.controllers;


import com.example.orchestra.entities.Post;
import com.example.orchestra.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
       return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.findPostById(id);
    }

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @DeleteMapping(value="/postDelete/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id){
        postService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/updatePost")
    public Post updatePost(@RequestBody Post post){
        return postService.updatePost(post);
    }

}
