/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing.
 * Copyright (c) 2022. Canadian Tire Corporation, Ltd. All rights reserved.
 */

package com.secure.authapipoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramController {

    @GetMapping(value = "program/show")
    public String programShow() {
        return "You can only see this program info!";
    }

    @PostMapping(value = "program/edit")
    public String programEdit() {
        return "You can see and edit program info here!";
    }
}
