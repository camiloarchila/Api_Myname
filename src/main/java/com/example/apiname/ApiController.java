package com.example.apiname;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String getStatus(){
        return "Esteban Camilo Archila Bastidas";
    }
}