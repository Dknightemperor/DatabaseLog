package com.db.logs.Logs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

    @RequestMapping("/home")
    public String getHomePage(Model model){
        return "home";
    }
}
