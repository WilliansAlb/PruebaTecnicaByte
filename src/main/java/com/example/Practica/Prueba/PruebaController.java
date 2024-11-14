package com.example.Practica.Prueba;

import com.example.Model.PruebaResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping("/hola")
    public PruebaResponse getHola() {
        PruebaResponse res = new PruebaResponse("Hola mundo!");
        return res;
    }
}