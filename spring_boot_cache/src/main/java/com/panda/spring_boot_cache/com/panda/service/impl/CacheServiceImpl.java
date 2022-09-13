package com.panda.spring_boot_cache.com.panda.service.impl;

import com.panda.spring_boot_cache.com.panda.service.CacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements CacheService {


    @Override
    @Cacheable(value = "message", key = "#msg")
    public String getMsgFromCache(String msg) {
        System.out.println("come into getMsgFromCache : " + msg);
        return msg;
    }
}
