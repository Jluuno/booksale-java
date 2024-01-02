package com.jluuno.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jluuno.entity.Category;
import org.apache.ibatis.annotations.Mapper;
/**
 * (Category)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-18 13:04:32
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}

