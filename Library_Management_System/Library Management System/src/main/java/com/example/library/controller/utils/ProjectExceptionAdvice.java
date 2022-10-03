package com.example.library.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("Server failure, please try again later");
    }
}