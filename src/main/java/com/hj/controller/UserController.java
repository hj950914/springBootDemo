package com.hj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
    JdbcTemplate jdbcTemplate;


    @GetMapping("/users")
    public List<Map<String, Object>> findUsers() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        return list;
    }
}
