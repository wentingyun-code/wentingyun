package com.soft.book.service;

import com.soft.book.model.dto.UserDTO;
import com.soft.book.model.entity.User;

public interface UserService {

    void queryAllUser();
    void addUser(UserDTO user);
}
