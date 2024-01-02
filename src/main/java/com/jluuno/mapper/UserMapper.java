package com.jluuno.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jluuno.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import javax.websocket.server.PathParam;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-18 21:34:35
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select password from user where user_name=#{userName}")
    String selectPassword(@PathParam("userName") String userName);

    @Select("select avatar from user where user_name=#{userName}")
    String selectbyUsername(@PathParam("userName") String userName);

    @Select("select  * from user where user_name=#{userName}")
    User selectInfoByUsername(@PathParam("userName") String userName);

}

