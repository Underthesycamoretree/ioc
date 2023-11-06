package com.dk.dto;

import org.springframework.stereotype.Repository;

/**
 * @author dun.kun
 * @version 1.0
 * @description: TODO
 * @date 2023/10/27 14:23
 */
@Repository("userDao")
public class UserDao implements IUserDao{
    private String name;
    private String age;
    private String id;

    public UserDao() {
        System.out.println("正在创建"+this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
