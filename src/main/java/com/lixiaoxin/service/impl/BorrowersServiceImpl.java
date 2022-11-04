package com.lixiaoxin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lixiaoxin.enity.Borrowers;
import com.lixiaoxin.mapper.BorrowersMapper;
import com.lixiaoxin.service.BorrowersService;
import com.lixiaoxin.util.IDGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【borrowers】的数据库操作Service实现
* @createDate 2022-10-27 11:38:36
*/
@Service
public class BorrowersServiceImpl implements BorrowersService {
    @Autowired
    BorrowersMapper borrowersMapper;
    @Autowired
    IDGenerate idGenerate;

    @Override
    public List<Borrowers> getall() {
       return  borrowersMapper.selectList(null);
    }

    @Override
    public int add(Borrowers borrowers) {
        borrowers.setId(idGenerate.generationID());
        if(borrowers.getVip()==0){
            borrowers.setBrrownum(10);
        }
        else{
            borrowers.setBrrownum(20);
        }
        int insert = borrowersMapper.insert(borrowers);
        return insert;
    }

    @Override
    public Borrowers findById(String id) {
        LambdaQueryWrapper<Borrowers> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Borrowers::getId,id);
        Borrowers borrowers = borrowersMapper.selectOne(lambdaQueryWrapper);

        return borrowers;
    }
}




