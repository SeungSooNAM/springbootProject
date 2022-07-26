package com.nam.project.main;

import org.springframework.web.bind.annotation.GetMapping;

public class mainController {
    
    @GetMapping("main")
    public String main(){

        return "main";
    }
}
