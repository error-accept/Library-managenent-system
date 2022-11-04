package com.lixiaoxin.service.impl;
import com.lixiaoxin.enity.Sysconfig;
import com.lixiaoxin.mapper.SysconfigMapper;
import com.lixiaoxin.service.SysconfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【sysconfig】的数据库操作Service实现
* @createDate 2022-10-27 11:38:36
*/
@Service
public class SysconfigServiceImpl implements SysconfigService {
    @Autowired
    SysconfigMapper sysconfigMapper;
    @Override
    public List<Sysconfig> getall() {
       return sysconfigMapper.selectList(null);
    }

    @Override
    public List<Sysconfig> change(Sysconfig sysconfig) {
        sysconfig.setId(1);
        sysconfigMapper.updateById(sysconfig);
        return getall();
    }
}




