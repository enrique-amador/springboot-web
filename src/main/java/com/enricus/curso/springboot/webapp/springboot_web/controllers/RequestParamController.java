package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enricus.curso.springboot.webapp.springboot_web.models.dto.ParamsDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public ParamsDto foo(@RequestParam(required=false, defaultValue="When message doens't come") String message){//message has to come in the URL
        ParamsDto paramDto = new ParamsDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/bar")
    public ParamsDto bar(@RequestParam String text, @RequestParam Integer code){
        ParamsDto params = new ParamsDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

}
