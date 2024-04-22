package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.InnerUserRepository;
import com.example.demo.models.User;

//https://www.youtube.com/watch?v=6zfIxgaVkQI
@Controller
@RequestMapping("/")
public class UsersController {

    @Autowired
    private InnerUserRepository repo;

    @GetMapping({"", "/"})
    public String index(Model model){
        //List <User> listUsers = repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
        //model.addAttribute("listUsers",listUsers);
        return "users/index";
    }

    
}
