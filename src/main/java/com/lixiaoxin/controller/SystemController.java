package com.lixiaoxin.controller;

import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.utils.ResultTool;
import com.lixiaoxin.enity.Sysconfig;
import com.lixiaoxin.service.SysconfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SystemController {
    @Autowired
    SysconfigService sysconfigService;
    @RequestMapping(value= "/sys",method= RequestMethod.GET)
    public Result get(){
        List<Sysconfig> Sysconfig=sysconfigService.getall();
        return  ResultTool.success(Sysconfig);
    }
    @RequestMapping(value= "/sys",method= RequestMethod.POST)
    public Result change(@RequestBody Sysconfig sysconfig){
        List<Sysconfig> Sysconfig=sysconfigService.change(sysconfig);
        return  ResultTool.success(Sysconfig);
    }

}
