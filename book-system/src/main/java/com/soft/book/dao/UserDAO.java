package com.soft.book.dao;

import com.soft.book.model.dto.UserDTO;
import com.soft.book.model.entity.User;

public interface UserDAO {
    void insertUser(UserDTO user);
    void selectAllUser();

}
