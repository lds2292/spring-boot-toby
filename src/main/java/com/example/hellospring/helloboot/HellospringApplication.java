package com.example.hellospring.helloboot;

import com.example.hellospring.config.MySpringBootApplication;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication

@MySpringBootApplication
public class HellospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellospringApplication.class, args);
    }

}
