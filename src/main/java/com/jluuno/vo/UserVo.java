package com.jluuno.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
public class UserVo {
 private Integer id;
 //账号
 private String userName;
 //密码
 private String password;
 private String avatar;
}

