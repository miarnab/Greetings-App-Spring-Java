package com.example.greetings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class MainController {
    @RequestMapping("/")
    public String root(ModelMap modelMap){
        modelMap.addAttribute("name", "My name is Arnab Mitra");
        return "mainTemplate";
    }
}
