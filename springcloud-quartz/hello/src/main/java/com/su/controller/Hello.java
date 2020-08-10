package com.su.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    private String doPrint(){
        System.out.println("Hell0-------------------");
        return "sssssssssssss";
    }

}
