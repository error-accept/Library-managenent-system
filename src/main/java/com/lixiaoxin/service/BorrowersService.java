package com.lixiaoxin.service;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lixiaoxin.enity.Borrowers;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【borrowers】的数据库操作Service
* @createDate 2022-10-27 11:38:36
*/
public interface BorrowersService  {

    List<Borrowers> getall();

    int add(Borrowers borrowers);

    Borrowers findById(String id);
}
