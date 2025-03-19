package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enricus.curso.springboot.webapp.springboot_web.Hijo;
import com.enricus.curso.springboot.webapp.springboot_web.User;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller + @ResponseBody
@RestController
@RequestMapping("/api") //ruta base de primer nivel
public class UserRestController {

    @GetMapping("/details") //@RequestMapping(path="/details", method = RequestMethod.GET)
    public Map<String, Object> details(Model model){
        User user = new User("Enrique", "Amador");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola, perro mundo");
        body.put("user", user);

        // model.put("title", "Hola, perro mundo con map");
        // model.put("name", "Enrique");
        // model.put("lastname", "Amador");

        return body; //nombre de la plantilla en resources/templates
    }
    
}
