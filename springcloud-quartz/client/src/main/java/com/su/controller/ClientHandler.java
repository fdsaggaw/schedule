package com.su.controller;

import com.su.feign.SchedulFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientHandler {
    //注入
    @Autowired
    private SchedulFeign schedulFeign;


}
