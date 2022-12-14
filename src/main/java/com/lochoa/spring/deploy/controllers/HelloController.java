package com.lochoa.spring.deploy.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/hello")
public class HelloController {

    @Value("${app.message}")
    private String message;

    @GetMapping
    public ResponseEntity<String> hola() {
        System.out.println(message);
        return ResponseEntity.ok("Hola Mundo");
    }
}
