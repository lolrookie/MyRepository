package com.example.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication {

    public static void main(String[] args) {
        System.err.println("Exception in thread \"main\" java.io.IOException:KFC Crazy Thursday need $50.");
        SpringApplication.run(HellowordApplication.class, args);
    }

}
