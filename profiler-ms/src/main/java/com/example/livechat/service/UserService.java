package com.example.livechat.service;

import com.example.livechat.DTO.UserDTO;
import com.example.livechat.entity.User;
import com.example.livechat.repository.UserRepository;
import org.hibernate.jdbc.Expectation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public  User getUserById(Long id) throws Exception{
        return userRepository.findById(id)
                .orElseThrow(() -> new Exception("User not found with ID: " + id));
    }

    public User createUser(UserDTO userDTO) {
        if (userRepository.existsByUserName(userDTO.getUserName())) {
            throw new IllegalArgumentException("Username already exists. Please choose a different username.");
        }
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setWelocomeMessage(userDTO.getWelcomeMessage());
        user.setCreationDate(LocalDateTime.now().toString());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) throws Exception {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new Exception("User not found with ID: " + id);
        }
    }
}
