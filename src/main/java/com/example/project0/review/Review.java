package com.example.project0.review;
import com.example.project0.location.Location;
import com.example.project0.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 14:21
 *
 * */


@Entity
@Data
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    @Column(name = "comment")
    private String comment;

    @Column(name = "stars")
    private int stars; // 1-5 arasında bir puan olabilir

    @Column(name = "review_date")
    private LocalDateTime reviewDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;



}
