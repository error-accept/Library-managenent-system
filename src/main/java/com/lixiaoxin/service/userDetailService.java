package com.lixiaoxin.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.enity.LoginUser;
import com.lixiaoxin.enity.User;
import com.lixiaoxin.mapper.AdminMapper;
import com.lixiaoxin.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userDetailService  implements UserDetailsService {
    @Resource
    AdminMapper adminMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO
        LambdaQueryWrapper<Admin> userWrapper = new LambdaQueryWrapper<>();
        userWrapper.eq(Admin::getName,username);
        Admin admin = adminMapper.selectOne(userWrapper);
        if(admin==null){
            new RuntimeException("账号未找到");
        }
        return new LoginUser(admin);
    }
}
