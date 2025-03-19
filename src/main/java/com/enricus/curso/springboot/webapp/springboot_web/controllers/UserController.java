package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.enricus.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Enrique", "Amador", "");
        user.setEmail("kike@kike.com");
        model.addAttribute("title", "Hola, perro mundo");
        model.addAttribute("user", user);

        // model.put("title", "Hola, perro mundo con map");
        // model.put("name", "Enrique");
        // model.put("lastname", "Amador");

        return "details"; //nombre de la plantilla en resources/templates
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        // List<User> users = Arrays.asList(
        //     new User("pepa", "gzz", "a@a.com"), 
        //     new User("juana", "cubana", "f@a.com"),
        //     new User("lalo", "landa", null));

        // model.addAttribute("users", users);
        model.addAttribute("title", "Lista de users");
        return "list";
    }

    @ModelAttribute("users") //para pasar datos comunes para las vistas, es decir, para reutilizar datos
    public List<User> userModel() {
        return Arrays.asList(
            new User("pepa", "gzz", "a@a.com"), 
            new User("juana", "cubana", "f@a.com"),
            new User("lalo", "landa", null));
    }
    
}
