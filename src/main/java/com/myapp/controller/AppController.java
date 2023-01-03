package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/spring")
    public String test(){
        return "test";
    }
    @RequestMapping("/Log")
    public String Log(){
        return "login";
    }
}
