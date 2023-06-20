package com.secure.authapipoc.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramController {

    @GetMapping(value = "program/show")
    @PreAuthorize("hasRole('Programs.READ')")
    public String programShow() {
        return "You can only see this program info!";
    }

    @PostMapping(value = "program/edit")
    @PreAuthorize("hasRole('Programs.EDIT')")
    public String programEdit() {
        return "You can see and edit program info here!";
    }
}
