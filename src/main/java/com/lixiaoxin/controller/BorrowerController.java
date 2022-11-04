package com.lixiaoxin.controller;

import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.utils.ResultTool;
import com.lixiaoxin.enity.Borrowers;
import com.lixiaoxin.service.BorrowersService;
import com.lixiaoxin.util.IDGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.lixiaoxin.common.enums.ResultCode.PARAM_NOT_VALID;

@RestController
@CrossOrigin
public class BorrowerController {
    @Autowired
    BorrowersService borrowersService;
    //获取读者列表
    @RequestMapping(value = "/Borrows" ,method = RequestMethod.GET)
    public Result getall (){
        List<Borrowers> borrowers=  borrowersService.getall();
        return ResultTool.success(borrowers);
    }
    @RequestMapping(value = "/Borrows" ,method = RequestMethod.POST)
    public Result add (@RequestBody Borrowers borrowers){
        System.out.println(borrowers);
        int flag=  borrowersService.add(borrowers);
        if(flag==0){
            return ResultTool.fail(PARAM_NOT_VALID);
        }
        return ResultTool.success(borrowers);
    }
    @RequestMapping(value = "/Borrows/{id}" ,method = RequestMethod.GET)
    public Result add (@PathVariable("id") String Id){
        if (Id==""){
            return ResultTool.fail(PARAM_NOT_VALID);
        }
        Borrowers flag=  borrowersService.findById(Id);
        if(flag==null){
            return ResultTool.fail(PARAM_NOT_VALID);
        }
        return ResultTool.success(flag);
    }
}
