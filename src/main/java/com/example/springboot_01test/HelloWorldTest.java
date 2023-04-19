package com.example.springboot_01test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldTest {
    @RequestMapping("/index")
    public String fun() {
        return "index";
    }
}
