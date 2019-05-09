package com.hj.controller;

import com.hj.entity.User;
import com.hj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Author: hj
 * Date: 2019-05-08 19:46
 * Description: <描述>
 */
@RestController()
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @return 返回所有用户
     */
    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * @param id
     * @return 返回单个用户
     */
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }


    /**
     * 新增用户
     */
    @PostMapping(value = "/users", consumes = APPLICATION_JSON_UTF8_VALUE)
    public void add(@RequestBody User user) {
        userService.add(user);
    }
}
