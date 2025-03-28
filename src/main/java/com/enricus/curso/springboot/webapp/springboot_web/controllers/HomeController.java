package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home() {

        // return "redirect:/details";

        return "forward:/list"; // este es como un request.getRequestDispatcher("/details").forward(request, response);
        //URL remains the same
    }
}
