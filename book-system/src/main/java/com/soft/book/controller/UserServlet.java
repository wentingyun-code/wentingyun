package com.soft.book.controller;

import com.soft.book.dao.UserDAO;
import com.soft.book.dao.impl.UserDaoImpl;
import com.soft.book.model.dto.UserDTO;
import com.soft.book.model.entity.User;
import com.soft.book.service.UserService;
import com.soft.book.service.imp.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.queryAllUser();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("lisi");
        userDTO.setNickname("lisi");
        userDTO.setPassword("123456");
        userDTO.setAvatar("");
        userDTO.setGender(0);
        userService.addUser(userDTO);
    }
}
