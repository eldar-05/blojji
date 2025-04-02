package com.itproger.blojji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String blogMain(Model model){
        return "blog-main";
    }
    
}
