package com.example.s3_hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class S3HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(S3HelloWorldApplication.class, args);
    }

}
