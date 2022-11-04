package com.lixiaoxin.controller;

import com.lixiaoxin.common.Result;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.enity.User;
import com.lixiaoxin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value= "/login",method= RequestMethod.POST)
    public Result login(@RequestBody Admin admin){
       return  loginService.login(admin);

    }




}
