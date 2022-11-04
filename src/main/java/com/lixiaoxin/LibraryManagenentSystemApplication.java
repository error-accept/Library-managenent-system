package com.lixiaoxin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com/lixiaoxin/mapper")

public class LibraryManagenentSystemApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LibraryManagenentSystemApplication.class, args);

    }

}
