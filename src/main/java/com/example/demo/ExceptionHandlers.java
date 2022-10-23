package com.example.demo;

import com.example.demo.exception.CustomException;
import com.example.demo.exception.CustomException2;
import com.example.demo.exception.CustomException3;
import com.example.demo.exception.CustomException4;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(CustomException.class)
    public String handleException(){
        System.out.println("custom exception was occured");
        return "custom exception was occured";
    }

    @ExceptionHandler(CustomException2.class)
    public ServerResponse handleException2(){
        System.out.println("custom exception2 was occured");
        return new ServerResponse(500, "error was occured");
    }

    @ExceptionHandler(CustomException3.class)
    public String handleException3(){
        System.out.println("custom exception3 was occured");
        return "custom exception was occured";
    }

    @ExceptionHandler(CustomException4.class)
    public ServerResponse handleException4(){
        System.out.println("custom exception4 was occured");
        return new ServerResponse(500, "error was occured");
    }


}
