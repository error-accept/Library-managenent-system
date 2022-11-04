package com.lixiaoxin.service.impl;


import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.lixiaoxin.enity.Books;
import com.lixiaoxin.enity.Borrow;
import com.lixiaoxin.enity.Borrowers;
import com.lixiaoxin.mapper.BooksMapper;
import com.lixiaoxin.mapper.BorrowMapper;
import com.lixiaoxin.mapper.BorrowersMapper;
import com.lixiaoxin.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【borrow】的数据库操作Service实现
* @createDate 2022-10-27 11:38:36
*/
@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    BorrowMapper borrowMapper;
    @Autowired
    BorrowersMapper borrowersMapper;
    @Autowired
    BooksMapper booksMapper;
    @Override
    public int borrow(Borrow borrow) {
        System.out.println(borrow);
        borrow.setBrrowtime(new Date());
        int flag=borrowMapper.insert(borrow);
        LambdaUpdateWrapper<Borrowers> uw=new LambdaUpdateWrapper<>();
        uw.eq(Borrowers::getId,borrow.getUserid());
        uw.setSql("brrownum=brrownum-1");
        int flag1=borrowersMapper.update(null,uw);
        LambdaUpdateWrapper<Books> uwb=new LambdaUpdateWrapper<>();
        uwb.eq(Books::getId,borrow.getBookid());
        uwb.setSql("borrow=borrow+1");
        uwb.setSql("hasnum=hasnum-1");
        int flag2=booksMapper.update(null,uwb);
        if(flag==1&&flag1==1&&flag2==1){
            return 1;
        }
        return 0;
    }

    @Override
    public int renew(int id) {
        Borrow borrow = borrowMapper.selectById(id);
        borrow.setDays(borrow.getDays()+10);
//        LambdaUpdateWrapper<Borrow> luwb=new LambdaUpdateWrapper<>();
        return borrowMapper.updateById(borrow);
    }
    @Override
    public int back(int id) {
        Borrow borrow = borrowMapper.selectById(id);
        borrow.setBacktime(new Date());
        borrowMapper.updateById(borrow);
        LambdaUpdateWrapper<Borrowers> uw=new LambdaUpdateWrapper<>();
        uw.eq(Borrowers::getId,borrow.getUserid());
        uw.setSql("brrownum=brrownum+1");
        int flag1=borrowersMapper.update(null,uw);
        LambdaUpdateWrapper<Books> uwb=new LambdaUpdateWrapper<>();
        uwb.eq(Books::getId,borrow.getBookid());
        uwb.setSql("borrow=borrow-1");
        uwb.setSql("hasnum=hasnum+1");
        int flag2=booksMapper.update(null,uwb);
        return 0;
    }
    @Override
    public Borrow getbyId(int id) {
       return borrowMapper.selectById(id);
    }

    @Override
    public List<Borrow> getall() {
        return borrowMapper.selectList(null);
    }
}




