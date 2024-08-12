package com.example.project0.infrastructure.exceptions;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 14:21
 *
 * */

public class LocationNotFoundException extends RuntimeException{
    public LocationNotFoundException(String message) {
        super(message);
    }
}
