package com.lixiaoxin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.mapper.AdminMapper;
import com.lixiaoxin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【admin】的数据库操作Service实现
* @createDate 2022-10-27 11:38:36
*/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    public List<Admin> getall(){
        List<Admin> admins = adminMapper.selectList(null);
        return  admins;
    }

    @Override
    public int add(Admin admin) {

        int insert = adminMapper.insert(admin);
        return insert;
    }

    @Override
    public int delete(String name) {
        LambdaQueryWrapper<Admin> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Admin::getName,name);
        int insert = adminMapper.delete(queryWrapper);
        return insert;
    }


}




