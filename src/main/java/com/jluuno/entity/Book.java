package com.jluuno.entity;
import java.util.Date;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("book")
public class Book {
    @TableId
    private Integer id;
    //书籍名字
    private String name;
    //作者名字
    private String author;
    //书籍价格
    private String price;
    //书籍图片
    private String img;
    //分类id
    private Integer categoryId;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}

