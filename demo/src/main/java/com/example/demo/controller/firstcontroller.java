package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstcontroller {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
