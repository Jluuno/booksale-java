package com.jluuno.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jluuno.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * (Book)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-17 22:26:33
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
    @Select("select * from book where category_id = #{id}")
    List<Book> bookCategory(@PathParam("id") Long id);
}

