package com.jluuno.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (Book)表实体类
 *
 * @author makejava
 * @since 2023-12-17 22:26:35
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookVo {
    private Integer id;
    //书籍名字
    private String name;
}

