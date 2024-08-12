package com.example.project0.user;

import com.example.project0.infrastructure.exceptions.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 11:16
 *
 * */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        Optional<User> existingUser = userRepository.findByName(user.getName());
        if (existingUser.isEmpty()) {
            return userRepository.save(user);
        } else {
            throw new UserAlreadyExistsException("User with name " + user.getName() + " already exists.");
        }


    }

    @Override
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() ->new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setSurname(userDetails.getSurname());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }
}
