package com.example.somethingdone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SomethingDoneApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SomethingDoneApplication.class, args);
    }

}
