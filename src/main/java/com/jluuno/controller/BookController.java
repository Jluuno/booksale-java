package com.jluuno.controller;

import com.jluuno.result.ResponseResult;
import com.jluuno.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (Book)表控制层
 *
 * @author makejava
 * @since 2023-12-17 22:26:32
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public ResponseResult bookList(Integer pageNum,Integer pageSize,String name){
        return bookService.bookList(pageNum,pageSize,name);
    }

    @GetMapping("/category/{id}")
    public ResponseResult bookCategory(@PathVariable Long id){
        return bookService.bookCategory(id);
    }

    @GetMapping("/details/{id}")
    public ResponseResult bookGetById(@PathVariable Long id){
        return bookService.bookGetById(id);
    }

    @GetMapping("/name")
    public ResponseResult bookGetName(){
        return bookService.bookGetName();
    }

}

