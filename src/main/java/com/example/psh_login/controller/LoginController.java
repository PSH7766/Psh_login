package com.example.psh_login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    //3. 페이지 넘기기 설정
    @GetMapping("/loginPage")
    public String Login() {return "/logins/loginPage";}
    //6. DTO 셋팅


}
