package com.example.project0.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 14:21
 *
 * */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByName(String name);
    List<Location> findByCategory(String category);
}
