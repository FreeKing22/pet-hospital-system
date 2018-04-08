package com.cui.phs.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {
/*    public static final int READER = 0;
    public static final int USER = 1;
    public static final int ADMIN = 2;*/
    private int id;
    private String password;
    private int role;
    private String username;

    public UserEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return this.role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
