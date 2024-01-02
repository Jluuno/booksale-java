package com.jluuno.entity;
import java.util.Date;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (Category)表实体类
 *
 * @author makejava
 * @since 2023-12-18 13:04:34
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("category")
public class Category {
@TableId
private Integer id;
//分类名
private String name;
//创建时间
private Date createTime;
//更新时间
private Date updateTime;
//创建人id
private Integer createBy;
//更新人id
private Integer updateBy;
}

