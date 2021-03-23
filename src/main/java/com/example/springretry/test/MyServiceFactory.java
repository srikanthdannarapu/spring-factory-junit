package com.example.springretry.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyServiceFactory {

    @Autowired
    private List<MyService> services;
    private static Map<String, MyService> myServiceCache = new HashMap<>();

    public MyServiceFactory(List<MyService> services) {
        this.services = services;
    }

    @PostConstruct
    public void initMyServiceCache() {
        for(MyService service : services) {
            myServiceCache.put(service.getType(), service);
        }
    }

    public static MyService getService(String type) {
        MyService service = myServiceCache.get(type);
        if(service == null) throw new RuntimeException("Unknown service type: " + type);
        return service;
    }
}