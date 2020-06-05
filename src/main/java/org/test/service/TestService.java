package org.test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Zack
 * @date 2020/6/5
 */
@Slf4j
@Service
public class TestService {
    public String hello(String name) {
        return "Hello " + name;
    }
}
