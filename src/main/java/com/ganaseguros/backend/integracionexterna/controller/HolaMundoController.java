package com.ganaseguros.backend.integracionexterna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/saludo")
    public String holaMundo(){
        return "Hola Mundo Spring";
    }
}
