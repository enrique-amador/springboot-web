package com.enricus.curso.springboot.webapp.springboot_web.controllers;

// import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.enricus.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Enrique", "Amador");
        user.setEmail("kike@kike.com");
        model.addAttribute("title", "Hola, perro mundo");
        model.addAttribute("user", user);

        // model.put("title", "Hola, perro mundo con map");
        // model.put("name", "Enrique");
        // model.put("lastname", "Amador");

        return "details"; //nombre de la plantilla en resources/templates
    }
    
}
