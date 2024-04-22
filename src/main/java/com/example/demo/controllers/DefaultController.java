package com.example.demo.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DefaultController {


    @GetMapping("/tuto")
    public String index(){
        return "default tuto";
    }

    @GetMapping("/tuto/add")
    public String add(){
        return "add tuto";
    }
    
}
