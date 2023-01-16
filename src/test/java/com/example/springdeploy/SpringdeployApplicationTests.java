package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Key;

@SpringBootTest
class SpringdeployApplicationTests {

    @Test
    void contextLoads() {
        System.getenv().forEach(
                (key, value) -> System.out.println(key + " " + value)
        );
    }

}
