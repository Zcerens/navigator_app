package com.example.project0.user;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 11:16
 *
 * */

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);

}
