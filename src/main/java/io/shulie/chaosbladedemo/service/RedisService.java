package io.shulie.chaosbladedemo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class RedisService {

    @Qualifier("objectRedisTemplate")
    @Resource
    RedisTemplate redisTemplate;

    public  String get() {
        return  redisTemplate.opsForValue().get("redis").toString();
    }
}
