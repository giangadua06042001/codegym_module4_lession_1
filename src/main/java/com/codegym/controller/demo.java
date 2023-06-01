package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class demo {
    @GetMapping("/demo1")
    public String showForm(){
        return "demo";

    }
    @GetMapping("/test")
    public String labaray(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "demoName";
    }
}
