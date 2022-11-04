package io.shulie.chaosbladedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("http")
@RestController
public class HttpController {


    @GetMapping("")
    public String httpHello() {
        return "http,hello";
    }


}
