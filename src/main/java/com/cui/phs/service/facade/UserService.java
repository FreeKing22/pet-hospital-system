package com.cui.phs.service.facade;

import com.cui.phs.entity.ResultEntity;

/**
 * Created by q_cui on 2018/4/26
 */
public interface UserService {

    ResultEntity getVerifyResult(String name,String password);

}
