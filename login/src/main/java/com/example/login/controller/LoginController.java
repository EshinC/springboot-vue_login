package com.example.login.controller;

import com.example.login.domain.Admin;
import com.example.login.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController extends BaseController{
    private String meg = "用户名输入不正确";
    @RequestMapping(value = "/loginController",method = RequestMethod.GET)
    public String loginController(@RequestParam(value = "username") String username,
                                  @RequestParam(value = "password") String password,
                                  HttpSession httpSession){

        System.out.println(username+" "+password);

        Admin admin = adminService.findByUsername(username);
        System.out.println(admin);
        if (admin!=null) {
            if (admin.getPassword().equals(password)) {
                httpSession.setAttribute("admin", admin);
                meg = admin.getClass().getSimpleName();
                System.out.println(meg);
            } else {
                meg = "密码输入错误";
            }
        }
        else
            meg = "您输入的账号有误";
        return meg;
    }

    /**
     * 判断用户名和密码是否一致
     * @param passwordFromDB
     * @param password
     * @return
     */
    public boolean loginjudge(String passwordFromDB,String password){
        if (passwordFromDB.equals(password)){
            return true;
        }else {
            return false;
        }
    }

}
