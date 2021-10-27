package com.github.klubidorka.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController {

    @GetMapping({"/start"})
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping({"/other"})
    public String other() {
        return "Other page";
    }
}
