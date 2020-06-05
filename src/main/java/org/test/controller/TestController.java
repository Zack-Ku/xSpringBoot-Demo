package org.test.controller;


import com.zackku.xspringboot.mvc.annotaion.XPathParam;
import com.zackku.xspringboot.mvc.annotaion.XRequestBody;
import com.zackku.xspringboot.mvc.annotaion.XRequestMapping;
import com.zackku.xspringboot.mvc.annotaion.XRestController;
import io.vertx.core.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zack
 * @date 2020/6/3
 */
@XRestController
@XRequestMapping("/test")
public class TestController {

    @XRequestMapping(value = "/a", method = {HttpMethod.GET, HttpMethod.POST})
    public String a() {
        return "hello a";
    }

    @XRequestMapping(value = "/b", method = HttpMethod.GET)
    public String b() {
        return "hello b";
    }

    @XRequestMapping(value = "/c", method = HttpMethod.POST)
    public Map<String, Object> c(@XRequestBody TestReq req, @XPathParam TestReq req2) {
        Map<String, Object> t = new HashMap<>();
        t.put("kkk", 1);
        t.put("sssa", 42);
        if (req != null) {
            t.put("req.a", req.getA());
        }
        if (req2 != null) {
            t.put("req.b", req2.getB());
        }
        return t;
    }
}
