package com.example.demo.repo;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "select u from User u where u.id = ?1")
    User getUserById(Integer userId);
}
