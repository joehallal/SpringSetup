package com.example.demo.exception;

import lombok.Data;

import java.util.Date;

@Data
public class ExceptionResponse {
    //timestamp
    private Date timestamp;
    //message
    private String message;
    //details
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
