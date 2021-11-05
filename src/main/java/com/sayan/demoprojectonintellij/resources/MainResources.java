package com.sayan.demoprojectonintellij.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainResources {

    @GetMapping
    public String getHomeResponse(){
        return "Hello World from IntelliJ!!";
    }
}
