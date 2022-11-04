package com.example.librarymanagenentsystem;

import com.lixiaoxin.LibraryManagenentSystemApplication;
import com.lixiaoxin.enity.User;
import com.lixiaoxin.mapper.userMapper;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@MapperScan("com/lixiaoxin/mapper")
public class MybatisPlusTest {
    public static void main(String[] args) {
        SpringApplication.run(LibraryManagenentSystemApplication.class, args);

    }

}
