package com.prime.springsecurityjwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping
    public String helloWorld(Principal principal) {
        return "Hello world with " + principal.getName();
    }

    @GetMapping("/hello")
    public String hello(Principal principal){
        return "Hello you" + principal.getName();
    }

}
