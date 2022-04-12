package com.example.beandemo;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String printBean() {
        return "This is MyBean";
    }
}
