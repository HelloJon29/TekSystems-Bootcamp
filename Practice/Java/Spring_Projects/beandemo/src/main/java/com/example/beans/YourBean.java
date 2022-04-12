package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class YourBean implements BeanInterface{

    @Override
    public String printBean() {
        return "This is YourBean";
    }
}
