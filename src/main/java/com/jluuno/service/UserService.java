package com.jluuno.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jluuno.entity.User;
import com.jluuno.result.ResponseResult;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2023-12-18 21:34:37
 */
public interface UserService extends IService<User> {
    ResponseResult login(User user);

    ResponseResult register(User user);

    ResponseResult getUserInfo(String userName);

    ResponseResult updateUserInfo(User user);
}
