package com.dzf.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/6/16.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

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

    public String execute() throws Exception {
        if (getUsername().equals("admin") && getPassword().equals("admin")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
