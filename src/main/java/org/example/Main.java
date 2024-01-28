package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // Исходники: https://github.com/IlyaLisov/data-analyser-microservice

        // 2. Чтение данных из кафки и их обработка - https://www.youtube.com/watch?v=zyF3OAMbS0k&list=PL3Ur78l82EFBhKojbSO26BVqQ7n4AthHC&index=2
        SpringApplication.run(Main.class, args);

    }
}