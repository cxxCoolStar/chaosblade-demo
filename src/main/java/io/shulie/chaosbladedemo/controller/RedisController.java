package io.shulie.chaosbladedemo.controller;

import io.shulie.chaosbladedemo.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("redis")
@RestController
public class RedisController {


    @Resource
    RedisService redisService;

    @GetMapping("")
    public String redisHello()  {
        try {
            return "hello,redis"+ redisService.get();
        } catch (Exception e) {
            return "exception";
        }
    }
}
