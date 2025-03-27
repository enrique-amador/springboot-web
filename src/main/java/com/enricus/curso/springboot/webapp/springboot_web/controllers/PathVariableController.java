package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enricus.curso.springboot.webapp.springboot_web.models.User;
import com.enricus.curso.springboot.webapp.springboot_web.models.dto.ParamsDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {


    @Value("${config.code}")
    private Long code;

    @Value("${config.username}")
    private String username;
    
    // @Value("${config.message}")
    // private String message;
    
    @Value("${config.listOfValues}")
    private List<String> listOfValues;
    
    // private String[] listOfValues;
    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> otherValues;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;
    @Value("#{${config.valuesMap}.price}")
    private String price;
    @GetMapping("/baz/{message}")
    public ParamsDto baz(@PathVariable() String message){ //a;ways has to come
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object>  mix(@PathVariable String product, @PathVariable Long id){
        Map<String, Object> map = new HashMap<>();
        map.put("product", product);
        map.put("id", id);
        return map;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message){
        Map<String, Object> json = new HashMap<>();
        json.put("code", code);
        json.put("username", username);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        json.put("otherValue", otherValues);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("price", price);
        
        return json;
    }
}
