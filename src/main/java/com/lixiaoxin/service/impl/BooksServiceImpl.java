package com.lixiaoxin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lixiaoxin.enity.Books;
import com.lixiaoxin.mapper.BooksMapper;
import com.lixiaoxin.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【books】的数据库操作Service实现
* @createDate 2022-10-27 11:38:36
*/
@Service
public class BooksServiceImpl implements BooksService {
   @Autowired
    BooksMapper booksMapper;
    @Override
    public List<Books> getall() {
        return booksMapper.selectList(null);
    }

    @Override
    public Books getByid(int id) {
        LambdaQueryWrapper<Books> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Books::getId,id);
        return booksMapper.selectOne(lambdaQueryWrapper);
    }
    @Override
    public Books getByName(String name) {
        LambdaQueryWrapper<Books> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Books::getName,name);
        return booksMapper.selectOne(lambdaQueryWrapper);
    }
}




