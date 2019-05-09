package com.hj.service.impl;

import com.hj.entity.User;
import com.hj.mapper.UserMapper;
import com.hj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: hj
 * Date: 2019-05-09 13:31
 * Description: <描述>
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }
}
