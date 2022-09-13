package com.panda.spring_boot_cache.com.panda.controller;

import com.panda.spring_boot_cache.com.panda.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Autowired
    private CacheService cacheService;

    @GetMapping
    public String testCache(String msg) {
        System.out.println(msg);
        return cacheService.getMsgFromCache(msg);
    }
}
