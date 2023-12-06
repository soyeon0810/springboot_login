package com.springboot.phototravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PhotoTravelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoTravelApplication.class, args);
    }
}