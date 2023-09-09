package com.example.musicstreamingservice.service;

import com.example.musicstreamingservice.exception.UserNotFoundException;
import com.example.musicstreamingservice.model.User;
import com.example.musicstreamingservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found"));
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("User with username " + username + " not found"));
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}


