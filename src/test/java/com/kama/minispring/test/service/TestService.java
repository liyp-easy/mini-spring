package com.kama.minispring.test.service;
import com.kama.minispring.stereotype.Service;
/**
 * 测试服务类
 *
 *
 *
 */
@Service
public class TestService {
    public String sayHello() {
        return "Hello from TestService!";
    }
} 