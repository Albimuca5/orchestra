package com.example.orchestra.repositories;


import com.example.orchestra.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends SoftDeleteRepository<User,Long> {
    @Query(value = "SELECT u FROM User u WHERE u.userName = :username")
    User findByUsername(@Param("username") String username);
}
