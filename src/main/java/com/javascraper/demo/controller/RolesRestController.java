package com.javascraper.demo.controller;

import java.util.List;

import com.javascraper.demo.model.Roles;
import com.javascraper.demo.repository.JobRepository;
import com.javascraper.demo.repository.RolesRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(value = "*")
public class RolesRestController {

    @Autowired
    RolesRepository rolesRepository;

    @GetMapping("/roles")
    public List<Roles> findAllRoles() {
        return rolesRepository.findAll();
    }
}
