package com.cui.phs.service.facade;

import com.cui.phs.entity.UserEntity;

public interface UserService {
    boolean signUp(UserEntity var1);

    boolean login(UserEntity var1);
}
