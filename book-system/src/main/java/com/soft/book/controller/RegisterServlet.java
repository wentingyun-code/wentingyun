package com.soft.book.controller;

import com.soft.book.model.dto.UserDTO;
import com.soft.book.service.UserService;
import com.soft.book.service.imp.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(req.getParameter("username"));
        userDTO.setNickname(req.getParameter("nickname"));
        userDTO.setPassword(req.getParameter("password"));
        userDTO.setAvatar("");
        userDTO.setGender(Integer.parseInt(req.getParameter("gender")));
        userService.addUser(userDTO);
    }
}