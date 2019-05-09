package com.hj.service;

import com.hj.entity.User;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-05-09 13:29
 * Description: <描述>
 */
public interface UserService {
    /**
     * @return 返回所有用户
     */
    public List<User> findAll();

    /**
     * @param id
     * @return 返回单个用户
     */
    public User findById(Long id);

    /**
     * 新增用户
     *
     * @param user
     */
    public void add(User user);
}
