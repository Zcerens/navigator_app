package com.example.project0.user;
import jakarta.persistence.*;
import lombok.Data;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 11:16
 *
 * */
@Entity
@Data
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    @Column(name= "name")
    private String name;

    @Column(name= "surname")
    private String surname;

}
