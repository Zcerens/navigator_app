package com.example.project0.user;

import java.util.List;
import java.util.Optional;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 11:16
 *
 * */

public interface UserService
{
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}
