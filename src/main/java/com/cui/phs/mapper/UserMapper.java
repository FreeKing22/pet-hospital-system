package com.cui.phs.mapper;

import com.cui.phs.entity.UserEntity;


public interface UserMapper {
     String checkUsername(String var1);

    boolean signUp(UserEntity var1);
}
