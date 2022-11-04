package io.shulie.chaosbladedemo.controller;

import io.shulie.chaosbladedemo.service.Consumer;
import io.shulie.chaosbladedemo.service.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("rocketmq")
@RestController
public class RocketMQController {

    @GetMapping("produce")
    public String produceMessage() {
        try {
            Producer.produceMessage();
        } catch (Exception e) {
            return e.getMessage();
        }
        return "produce,hello";
    }

    @GetMapping("consumer")
    public String consumerMessage() {
        try {
            Consumer.consumerMessage();
        } catch (Exception e) {
            return e.getMessage();
        }
        return "consumer,hello";
    }
}

