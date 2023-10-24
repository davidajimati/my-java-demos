package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SuppressWarnings("ALL")
@SpringBootApplication
@RestController
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        SpringApplication.run(HelloWorld.class, args);
    }
    @GetMapping("/greet")
    public greetResponse greet() {
//        return "Hello";
        return new greetResponse("Hello",
                List.of("Man U", "Barcelona", "Real Madrid", "FC bayern"),
                new Person("Ajimati", 20, 670_000_000, true));
    }

    record Person(String name,
                  int age,
                  double availableCash,
                  Boolean married
                  ){}
    record greetResponse(
            String greet,
            List<String> favClubs,
            Person person
    ) {
    }
}
