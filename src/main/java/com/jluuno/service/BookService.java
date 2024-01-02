package com.jluuno.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jluuno.entity.Book;
import com.jluuno.result.ResponseResult;

/**
 * (Book)表服务接口
 *
 * @author makejava
 * @since 2023-12-17 22:26:36
 */
public interface BookService extends IService<Book> {
    ResponseResult bookList(Integer pageNum, Integer pageSize, String name);

    ResponseResult bookCategory(Long id);

    ResponseResult bookGetById(Long id);

    ResponseResult bookGetName();

}
