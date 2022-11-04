package com.lixiaoxin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【admin】的数据库操作Service
* @createDate 2022-10-27 11:38:36
*/
public interface AdminService  {


    List<Admin> getall();

    int add(Admin admin );

    int delete(String name);
}
