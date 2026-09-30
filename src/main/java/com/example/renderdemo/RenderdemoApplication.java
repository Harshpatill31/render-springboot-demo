package com.example.renderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class RenderdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenderdemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/students")
    public List<String> students() {
        return Arrays.asList("John", "Alice", "Bob");
    }
}
