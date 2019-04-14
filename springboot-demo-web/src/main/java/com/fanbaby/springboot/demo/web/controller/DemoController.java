package com.fanbaby.springboot.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/demoTest")
    public String demoTest() {
        return "Success";
    }
}
