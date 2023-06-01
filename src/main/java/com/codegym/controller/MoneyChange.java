package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.String.valueOf;

@Controller
public class MoneyChange {
    @GetMapping("/money")
    public String showFormChang(){
        return "fromChang";
    }
    @PostMapping("/change")
    public String change(@RequestParam int USD,Model model){
        model.addAttribute("USD", USD);
        
     return null;
    }
}
