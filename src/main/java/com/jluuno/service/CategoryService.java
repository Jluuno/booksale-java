package com.jluuno.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jluuno.entity.Category;
import com.jluuno.result.ResponseResult;

/**
 * (Category)表服务接口
 *
 * @author makejava
 * @since 2023-12-18 13:04:35
 */
public interface CategoryService extends IService<Category> {
    ResponseResult categoryList();
}
