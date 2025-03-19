package com.enricus.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enricus.curso.springboot.webapp.springboot_web.models.User;
import com.enricus.curso.springboot.webapp.springboot_web.models.dto.UserDto;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller + @ResponseBody
@RestController
@RequestMapping("/api") //ruta base de primer nivel
public class UserRestController {

    @GetMapping(path="/details") //@RequestMapping(path="/details", method = RequestMethod.GET)
    public UserDto details(){
        User user = new User("Enrique", "Amador");
        
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola, mundillo");

        return userDto; //devolviendo DTO
    }

    @GetMapping("/list")
    public List<User>list(){
        User user1 = new User("Enrique", "Amador");
        User user2 = new User("Andres", "Doe");
        User user3 = new User("Pepe", "Gzz");

        // List<User> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);

        List<User> users = Arrays.asList(user1, user2, user3);

        return users;
    }

    @GetMapping(path="/details-map") //@RequestMapping(path="/details", method = RequestMethod.GET)
    public Map<String, Object> detailsMap(){
        User user = new User("Enrique", "Amador");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola, perro mundo");
        body.put("user", user);

        return body; //devolviendo map
    }
    
}
