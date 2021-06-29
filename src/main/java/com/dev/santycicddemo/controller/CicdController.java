package com.dev.santycicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {
    @GetMapping("/")
    String some(){
        return "santy";
    }

}
