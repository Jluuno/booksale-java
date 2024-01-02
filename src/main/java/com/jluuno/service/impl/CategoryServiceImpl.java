package com.jluuno.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jluuno.entity.Category;
import com.jluuno.mapper.CategoryMapper;
import com.jluuno.result.ResponseResult;
import com.jluuno.service.CategoryService;
import com.jluuno.utils.BeanCopyUtils;
import com.jluuno.vo.categoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Category)表服务实现类
 *
 * @author makejava
 * @since 2023-12-18 13:04:36
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public ResponseResult categoryList() {
        List<Category> categories = categoryMapper.selectList(null);
        List<categoryVo> categoryVos = BeanCopyUtils.copyBeanList(categories, categoryVo.class);
        return ResponseResult.okResult(categoryVos);
    }
}
