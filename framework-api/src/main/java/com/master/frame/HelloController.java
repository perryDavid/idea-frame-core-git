package com.master.frame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    public IpConfiguration ip;

    @Value("${terms}")
    private String hello;

    @RequestMapping("/")
    public String sayHello(){
        return hello + "," + ip.getPort();
    }

    @RequestMapping("/map/getMapTemplate")
    public Map<String,Object> getMapTemplate(){
        Map<String,Object> map = new HashMap<>();
        map.put("userId","1");
        map.put("userName","张三");
        map.put("age",10);
        map.put("balance",200);
        map.put("hello",hello);
        return map;
    }


}
