package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> details(Model model){

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola, perro mundo");
        body.put("name", "Enrique");
        body.put("lastname", "Amador");

        // model.put("title", "Hola, perro mundo con map");
        // model.put("name", "Enrique");
        // model.put("lastname", "Amador");

        return body; //nombre de la plantilla en resources/templates
    }
    
}
