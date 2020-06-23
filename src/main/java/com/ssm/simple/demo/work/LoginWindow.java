package com.ssm.simple.demo.work;

import java.util.ArrayList;
import java.util.List;

/**
 * 登录窗口
 *
 * @Author peanutnowing
 * @Date 2020/6/23
 */
public class LoginWindow {

    public static void main(String[] args) {

        SimpleComponent pictureLogo = new SimpleComponent("Picture(LOGO图片)");
        SimpleComponent loginButton = new SimpleComponent("Button(登录)");
        SimpleComponent registerButton = new SimpleComponent("Button(注册)");
        SimpleComponent labelName = new SimpleComponent("Label(用户名)");
        SimpleComponent textBoxName = new SimpleComponent("TextBox(文本框)");
        SimpleComponent labelPass = new SimpleComponent("Label(密码)");
        SimpleComponent passwordBox = new SimpleComponent("PasswordBox(密码框)");
        SimpleComponent checkBox = new SimpleComponent("CheckBox(复选框)");
        SimpleComponent textBox = new SimpleComponent("TextBox(记住用户名)");
        SimpleComponent linkLable = new SimpleComponent("LinkLabel(忘记密码)");

        List<Component> componentList = new ArrayList<Component>();
        componentList.add(labelName);
        componentList.add(textBoxName);
        componentList.add(labelPass);
        componentList.add(passwordBox);
        componentList.add(checkBox);
        componentList.add(textBox);
        componentList.add(linkLable);
        Container loginFrame = new Container("FRAME1",componentList);

        List<Component> components = new ArrayList<Component>();
        components.add(pictureLogo);
        components.add(loginButton);
        components.add(registerButton);
        components.add(loginFrame);
        Container winForm = new Container("WINDOW窗口",components);
        winForm.displayComponent();
    }
}
