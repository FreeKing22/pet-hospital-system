package com.cui.phs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cui.phs.mapper.UserMapper;
import com.cui.phs.entity.UserEntity;
import com.cui.phs.service.facade.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Transactional
    public boolean login(UserEntity userDto) {
        try {
            String password = this.userDao.checkUsername(userDto.getUsername());
            return userDto.getPassword().equals(password);
        } catch (Exception var3) {
            return false;
        }
    }

    @Transactional
    public boolean signUp(UserEntity userDto) {
        return this.userDao.signUp(userDto);
    }
}
