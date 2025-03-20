package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enricus.curso.springboot.webapp.springboot_web.models.dto.ParamsDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamsDto baz(@PathVariable() String message){ //a;ways has to come
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
}
