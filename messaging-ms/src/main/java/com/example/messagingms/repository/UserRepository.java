package com.example.messagingms.repository;

import com.example.messagingms.entity.User;
import com.example.messagingms.utils.UserStaus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {
    List<User> findAllByStatus(UserStaus status);
}