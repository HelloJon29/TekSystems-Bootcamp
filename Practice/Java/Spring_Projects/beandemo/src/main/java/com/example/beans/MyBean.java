package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanInterface{
    @Override
    public String printBean() {
        return "This is MyBean";
    }
}
