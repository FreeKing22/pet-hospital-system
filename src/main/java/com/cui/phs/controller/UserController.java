package com.cui.phs.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.cui.phs.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cui.phs.entity.UserEntity;
import com.cui.phs.service.facade.UserService;

@Controller
@RequestMapping({"/user"})
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    public UserController() {
    }

    @RequestMapping(
            value = {"/signUp"},
            method = {RequestMethod.POST},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public Map<String, Object> signUp(@RequestBody UserEntity userEntity) throws IOException {
        Map<String, Object> map = new HashMap();
        boolean result = false;

        try {
            result = this.userServiceImpl.signUp(userEntity);
            if (result) {
                map.put("succeed", true);
                map.put("code", Integer.valueOf(200));
                map.put("data", "注册成功,将自动为您登录！");
            } else {
                map.put("succeed", false);
                map.put("code", Integer.valueOf(300));
                map.put("data", "注册失败!");
            }
        } catch (Exception var5) {
            map.put("succeed", false);
            map.put("code", Integer.valueOf(500));
            map.put("data", var5.getMessage());
        }

        return map;
    }

    @RequestMapping(
            value = {"/login"},
            method = {RequestMethod.POST},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public Map<String, Object> login(@RequestBody UserEntity userDto) throws IOException {
        Map<String, Object> map = new HashMap();
        boolean result = false;

        try {
            result = this.userServiceImpl.login(userDto);
            if (result) {
                map.put("succeed", true);
                map.put("code", Integer.valueOf(200));
                map.put("data", "登陆成功");
            } else {
                map.put("succeed", false);
                map.put("code", Integer.valueOf(300));
                map.put("data", "错误的用户名或密码!");
            }
        } catch (Exception var5) {
            map.put("succeed", false);
            map.put("code", Integer.valueOf(500));
            map.put("data", var5.getMessage());
        }

        return map;
    }
}
