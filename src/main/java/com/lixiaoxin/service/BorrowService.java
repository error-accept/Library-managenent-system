package com.lixiaoxin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lixiaoxin.enity.Borrow;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【borrow】的数据库操作Service
* @createDate 2022-10-27 11:38:36
*/
public interface BorrowService  {
    int borrow(Borrow borrow);
    int renew(int id);
    int back(int id);


    Borrow getbyId(int id);

    List<Borrow> getall();
}
