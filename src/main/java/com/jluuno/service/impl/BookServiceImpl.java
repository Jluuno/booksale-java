package com.jluuno.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jluuno.entity.Book;
import com.jluuno.mapper.BookMapper;
import com.jluuno.result.ResponseResult;
import com.jluuno.service.BookService;
import com.jluuno.utils.BeanCopyUtils;
import com.jluuno.vo.BookVo;
import com.jluuno.vo.PageVo;
import io.jsonwebtoken.lang.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Book)表服务实现类
 *
 * @author makejava
 * @since 2023-12-17 22:26:37
 */
@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public ResponseResult bookList(Integer pageNum, Integer pageSize, String name) {
        Page<Book> page=new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<Book> wrapper=new LambdaQueryWrapper<>();
        wrapper.like(Strings.hasText(name),Book::getName,name);
        page(page,wrapper);
        List<Book> records = page.getRecords();
        long total = page.getTotal();
        PageVo pageVo=new PageVo(records,total);
        return ResponseResult.okResult(pageVo);
    }

    @Override
    public ResponseResult bookCategory(Long id) {
        List<Book> books = bookMapper.bookCategory(id);
        return ResponseResult.okResult(books);
    }

    @Override
    public ResponseResult bookGetById(Long id) {
        Book book = bookMapper.selectById(id);
        return ResponseResult.okResult(book);
    }

    @Override
    public ResponseResult bookGetName() {
        List<Book> books = bookMapper.selectList(null);
        List<BookVo> bookVos = BeanCopyUtils.copyBeanList(books, BookVo.class);
        return ResponseResult.okResult(bookVos);
    }
}
