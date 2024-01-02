package com.jluuno.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jluuno.entity.User;
import com.jluuno.mapper.UserMapper;
import com.jluuno.result.ResponseResult;
import com.jluuno.service.UserService;
import com.jluuno.utils.BeanCopyUtils;
import com.jluuno.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-12-18 21:34:39
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResponseResult login(User user) {
        System.out.println("Received login request with user: " + user);
        if (Objects.isNull(user)){
            throw new RuntimeException("用户信息为空");
        }
        String userName = user.getUserName();
        String password = user.getPassword();
        String passwordInSql = userMapper.selectPassword(userName);

        // 检查密码是否为 null
        if (passwordInSql != null && passwordInSql.equals(password)) {
            String avatar=userMapper.selectbyUsername(userName);
            UserVo userVo=new UserVo();
            userVo.setAvatar(avatar);
            return ResponseResult.okResult(userVo);
        }
        return ResponseResult.errorResult(403,"用户名或密码错误");
    }

    @Override
    public ResponseResult register(User user) {
        if (Objects.isNull(user)){
            throw new RuntimeException("注册用户信息为空");
        }
        save(user);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult getUserInfo(String userName) {
        User userInfo=userMapper.selectInfoByUsername(userName);
        UserVo userVo = BeanCopyUtils.copyBean(userInfo, UserVo.class);
        return ResponseResult.okResult(userVo);
    }

    @Override
    public ResponseResult updateUserInfo(User user) {
        updateById(user);
        return ResponseResult.okResult();
    }

}
