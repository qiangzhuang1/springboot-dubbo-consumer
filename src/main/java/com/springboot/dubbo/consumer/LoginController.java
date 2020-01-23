package com.springboot.dubbo.consumer;

import com.springboot.dubbo.demo.LoginService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Reference
    LoginService loginService;

    @GetMapping("/login")
    public String login(){
        return loginService.login("admin", "admin1");
    }
}
