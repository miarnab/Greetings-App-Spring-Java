package com.example.greetings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String root(Model model){
        model.addAttribute("name", "Hello! My name is Arnab Mitra");
        return "mainTemplate";
    }
}
