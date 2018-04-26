package com.cui.phs.service.impl;

import com.cui.phs.entity.ResultEntity;
import com.cui.phs.entity.UserEntity;
import com.cui.phs.mapper.UserMapper;
import com.cui.phs.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by q_cui on 2018/4/26
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultEntity getVerifyResult(String userName, String password){
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResultCode(1);
        resultEntity.setResultMessage("登录失败");
        if(null!=userName&&userName.length()>0&&this.containsUser(userName)){
            if(null!=password&&password.length()>0&&verifyPassword(userName, password)){
                resultEntity.setResultCode(0);
                resultEntity.setResultMessage("登录成功");
            }
            else{
                resultEntity.setResultCode(1);
                resultEntity.setResultMessage("密码错误，请重新输入");
            }
        }
        else{
            resultEntity.setResultCode(1);
            resultEntity.setResultMessage("没有相关用户");
        }
        return resultEntity;
    }

    private boolean containsUser(String userName){
        List<UserEntity> users = userMapper.getAllUser();
        boolean flag = false;
        for(UserEntity user:users){
            if(user.getName().equals(userName)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean verifyPassword(String userName, String password){
        List<UserEntity> users = userMapper.getAllUser();
        boolean flag = false;
        for(UserEntity user:users){
            if(user.getName().equals(userName)){
                if(user.getPassword().equals(password)){
                    flag = true;
                    break;
                }
                else
                    break;
            }
        }
        return flag;
    }

}
