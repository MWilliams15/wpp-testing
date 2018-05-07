package com.workplacementplatform.userinterface.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/Home")
public class HomeController {

    @GetMapping("")
    public String index() {
        return "Home/Index";
    }  
}