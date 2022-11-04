package com.lixiaoxin.service;

import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.utils.ResultTool;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.enity.LoginUser;
import com.lixiaoxin.enity.User;
import com.lixiaoxin.util.JwtUtil;
import com.lixiaoxin.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@Service
public class LoginService {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    RedisUtil redisUtil;
    public Result login(Admin admin) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(admin.getName(),admin.getPassword());
        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
         if(Objects.isNull(authenticate)){
            new RuntimeException("登录失败");
        }
        LoginUser principal = (LoginUser) authenticate.getPrincipal();
        String id = principal.getAdmin().getId().toString();
        String jwtToken = JwtUtil.createJWT(id);
        Map<String,String> map=new HashMap<>();
        map.put("token",jwtToken);
        redisUtil.set("userid",jwtToken);
        String userid = (String)redisUtil.get("userid");
        System.out.println(userid);
        return ResultTool.success(map);
    }
}
