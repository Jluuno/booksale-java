package com.jluuno.controller;


import com.jluuno.result.ResponseResult;
import com.jluuno.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Category)表控制层
 *
 * @author makejava
 * @since 2023-12-18 13:04:31
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResponseResult categoryList(){
        return categoryService.categoryList();
    }
}

