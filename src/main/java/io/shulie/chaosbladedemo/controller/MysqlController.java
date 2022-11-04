package io.shulie.chaosbladedemo.controller;

import io.shulie.chaosbladedemo.service.MysqlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RequestMapping("mysql")
@RestController
public class MysqlController {


    @GetMapping("")
    public String mysqlHello()  {
        try {
            return "mysql,hello"+ MysqlService.select();
        } catch (Exception e) {
            return "exception";
        }
    }



}