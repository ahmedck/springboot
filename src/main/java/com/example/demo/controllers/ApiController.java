package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.services.InnerUserRepository;
import com.example.demo.models.User;

//https://www.youtube.com/watch?v=6zfIxgaVkQI
@RestController
@RequestMapping("/api/users")
public class ApiController {

    @Autowired
    private InnerUserRepository repo;

    @GetMapping({ "", "/" })
    public List<User> index() {
        return repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping({ "", "/" })
    public User add(@RequestBody User u) {
        return repo.save(u);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User p, @PathVariable int id) {
        User u = repo.findById(id).orElse(null);
        u.setRoles(p.getRoles());
        u.setEmail(p.getEmail());
        u.setPassword(p.getPassword());
        return repo.save(u);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return null;
    }

}
