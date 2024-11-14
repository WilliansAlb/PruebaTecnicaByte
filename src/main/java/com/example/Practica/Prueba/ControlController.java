package com.example.Practica.Prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlController {

    @GetMapping("/message")
    public String message() {
        return "mensaje";
    }
}
