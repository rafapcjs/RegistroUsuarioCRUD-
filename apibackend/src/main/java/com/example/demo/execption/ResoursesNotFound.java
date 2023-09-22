package com.example.demo.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResoursesNotFound extends      RuntimeException {
    private  static  final long Serial =1L;
    public ResoursesNotFound(String message){
        super(message);
    }
}
