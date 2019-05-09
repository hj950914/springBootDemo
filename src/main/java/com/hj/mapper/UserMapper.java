package com.hj.mapper;

import com.hj.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: hj
 * Date: 2019-05-09 11:15
 * Description: <描述>
 */
@Mapper
public interface UserMapper {

    /**
     * @return 返回所有用户
     */
    public List<User> selectAll();

    /**
     * @param id
     * @return 返回单个用户
     */
    public User selectById(Long id);

    /**
     * 新增用户
     *
     * @param user
     */
    public void insert(User user);
}
