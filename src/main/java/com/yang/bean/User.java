package com.yang.bean;

/**
 * @description
 * @author: yanghz
 * @create: 2019-06-09 20:08
 **/
public class User {
    private Long user_id;
    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(Long user_id, String username, String password, String email) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
