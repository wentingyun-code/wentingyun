package com.soft.book.service.imp;

import com.soft.book.dao.UserDAO;
import com.soft.book.dao.impl.UserDaoImpl;
import com.soft.book.model.dto.UserDTO;
import com.soft.book.model.entity.User;
import com.soft.book.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDAO userDAO = new UserDaoImpl();

    @Override
    public void queryAllUser() {
        userDAO.selectAllUser();

    }

    @Override
    public void addUser(UserDTO user) {
        userDAO.insertUser(user);

    }
}
