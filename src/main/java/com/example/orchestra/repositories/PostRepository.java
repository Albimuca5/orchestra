package com.example.orchestra.repositories;

import com.example.orchestra.entities.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends SoftDeleteRepository<Post,Long> {
}
