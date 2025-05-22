package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class LocationVoitureController {

    @GetMapping("/hello")
    public String sayHello() {
        return "L'application de location de voitures fonctionne correctement!";
    }

    @GetMapping("/status")
    public String checkStatus() {
        return "Status: OK \n"
             + "Spring Boot est opérationnel \n"
             + "MySQL/H2 est connecté (vérifiez les logs pour confirmation)";
    }
}