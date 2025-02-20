package com.korit.springboot_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisTokenService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


}
