package com.lixiaoxin.controller;

import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.utils.ResultTool;
import com.lixiaoxin.enity.Borrow;
import com.lixiaoxin.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.lixiaoxin.common.enums.ResultCode.PARAM_NOT_VALID;
@RestController
public class BorrowController {
    @Autowired
    BorrowService borrowService;
    @RequestMapping(value = "/borrow", method = RequestMethod.POST)
    public Result borrow(@RequestBody Borrow borrow){
        int cur = borrowService.borrow(borrow);
        if(cur==1){
            return ResultTool.success(cur);
        }
        return  ResultTool.fail(PARAM_NOT_VALID);
    }
    @RequestMapping(value = "/borrows", method = RequestMethod.GET)
    public Result getall(){
        List<Borrow> borrows = borrowService.getall();
        return ResultTool.success(borrows);
    }
    @RequestMapping(value = "/borrows/{id}", method = RequestMethod.GET)
    public Result getbyid(@PathVariable("id") int id){
        Borrow cur = borrowService.getbyId(id);
            return ResultTool.success(cur);
    }
    @RequestMapping(value = "/borrows/back/{id}", method = RequestMethod.PUT)
    public Result back(@PathVariable("id") int id){
        int cur = borrowService.back(id);
        return ResultTool.success(cur);
    }
}
