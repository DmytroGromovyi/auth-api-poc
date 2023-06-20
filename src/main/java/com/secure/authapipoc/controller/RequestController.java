package com.secure.authapipoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {


    @GetMapping(value = "request/show")
    public String requestShow(){
        return "You can only see this request info!";
    }

    @PostMapping(value = "request/edit")
    public String requestEdit() {
        return "You can see and edit request info here!";
    }

}
