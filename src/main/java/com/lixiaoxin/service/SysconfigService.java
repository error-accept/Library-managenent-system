package com.lixiaoxin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lixiaoxin.enity.Sysconfig;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【sysconfig】的数据库操作Service
* @createDate 2022-10-27 11:38:36
*/
public interface SysconfigService  {

    List<Sysconfig> getall();

    List<Sysconfig> change(Sysconfig sysconfig);
}
