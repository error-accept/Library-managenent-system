package com.lixiaoxin.controller;
import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.utils.ResultTool;
import com.lixiaoxin.enity.Books;
import com.lixiaoxin.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin
public class BookController {
    @Autowired
    BooksService booksService;
    @RequestMapping(value = "/books",method= RequestMethod.GET)
    public Result Book(){
        List<Books> books = booksService.getall();
        return ResultTool.success(books);
    }
    @RequestMapping(value = "/book/{id}",method= RequestMethod.GET)
    public Result Byid(@PathVariable("id") int id) {
       Books book  = booksService.getByid(id);
        System.out.println("get id");
        return ResultTool.success(book);
    }
    @RequestMapping(value = "/book/name/{name}",method= RequestMethod.GET)
    public Result Byname(@PathVariable("name") String name){
        Books book = booksService.getByName(name);
        return ResultTool.success(book);
    }
}