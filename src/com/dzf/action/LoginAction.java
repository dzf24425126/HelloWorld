package com.dzf.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/6/16.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String tip;

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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String regist() throws Exception {
        ActionContext.getContext().getSession().put("user", getUsername());
        setTip("恭喜您," + getUsername() + ",已经注册成功");
        return SUCCESS;
    }

    public String login() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        Integer counter = (Integer) ctx.getApplication().get("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter = counter + 1;
        }
        ctx.getApplication().put("counter", counter);
        ctx.getSession().put("user", getUsername());
        if (getUsername().equals("admin") && getPassword().equals("admin")) {
            ctx.put("tip", "服务器提示：您已经成功登陆");
            return SUCCESS;
        } else {
            ctx.put("tip", "服务器提示：登陆失败");
            return ERROR;
        }
    }
}
