package com.example.librarymanagenentsystem;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.enity.User;
import com.lixiaoxin.mapper.AdminMapper;
import com.lixiaoxin.mapper.userMapper;
import com.lixiaoxin.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryManagenentSystemApplicationTests {
    @Resource
   userMapper userMapper;
    @Resource
    AdminMapper adminMapper;


    @Test
    public void UserTest(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Test
    public  void test2(){
        List<Admin> admins = adminMapper.selectList(null);
        System.out.println(admins);


    }
    @Test
    public void EncodingTest(){

        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("12");
        System.out.println(encode);
    }


}
