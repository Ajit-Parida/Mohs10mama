package com.mohs10.registrationlogindemo.service;

import com.mohs10.registrationlogindemo.dto.UserDto;
import com.mohs10.registrationlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
