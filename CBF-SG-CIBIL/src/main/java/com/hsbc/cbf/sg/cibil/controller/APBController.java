package com.hsbc.cbf.sg.cibil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APBController {

    @RequestMapping("/")
    public String index() {
        return "Testing Git";
    }

}