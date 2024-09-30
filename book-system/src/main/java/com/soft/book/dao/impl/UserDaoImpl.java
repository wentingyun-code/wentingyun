package com.soft.book.dao.impl;

import com.soft.book.dao.UserDAO;
import com.soft.book.model.dto.UserDTO;
import com.soft.book.model.entity.User;
import com.soft.book.utils.JdbcUtil;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDAO {

    private final JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getDataSource());


    @Override
    public void insertUser(UserDTO user) {
        String sql = "insert into t_user (username,nickname,password,avatar,gender) values(?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, user.getUsername(), user.getNickname(), user.getPassword(), user.getAvatar(), user.getGender());
        System.out.println(update);


    }

    @Override
    public void selectAllUser() {
        String sql = "select * from t_user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        System.out.println(query);

    }
}
