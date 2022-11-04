package com.lixiaoxin.controller;

import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.utils.ResultTool;
import com.lixiaoxin.enity.Admin;
import com.lixiaoxin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.lixiaoxin.common.enums.ResultCode.PARAM_NOT_VALID;

@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;
    @RequestMapping(value = "/Admin" ,method= RequestMethod.GET)
    public Result getall(){
        List<Admin> admins= adminService.getall();
        return  ResultTool.success(admins);
    }
    @RequestMapping(value = "/Admin" ,method= RequestMethod.POST)
    public Result add(@RequestBody Admin admin){
         int flag =adminService.add(admin);
         if(flag==1){
             return  ResultTool.success(flag);
         }
         return ResultTool.fail(PARAM_NOT_VALID);

    }
    @RequestMapping(value = "/Admin/{name}" ,method= RequestMethod.DELETE)
    public Result delete(@PathVariable("name") String name){
        int flag =adminService.delete(name);
        if(flag==1){
            return  ResultTool.success(flag);
        }
        return ResultTool.fail(PARAM_NOT_VALID);
    }
}
