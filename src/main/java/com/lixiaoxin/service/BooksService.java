package com.lixiaoxin.service;
import com.lixiaoxin.enity.Books;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【books】的数据库操作Service
* @createDate 2022-10-27 11:38:36
*/
public interface BooksService  {

    List<Books> getall();
//    Books getByid(String id);

    Books getByid(int id);

    Books getByName(String name);
}
