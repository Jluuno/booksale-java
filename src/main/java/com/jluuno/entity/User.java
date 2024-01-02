package com.jluuno.entity;
import java.util.Date;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2023-12-18 21:34:36
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
@TableId
private Integer id;
//账号
private String userName;
//密码
private String password;
private Date createTime;
private Date updateTime;

private String avatar;
}

