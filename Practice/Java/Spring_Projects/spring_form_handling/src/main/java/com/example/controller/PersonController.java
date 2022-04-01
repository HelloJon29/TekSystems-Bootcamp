package com.example.controller;

import com.example.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @GetMapping("/personPage1")
    public String personForm(
            @RequestParam(name="name", required = false, defaultValue = "Your Name") String name,
            @RequestParam(name="age", required = false, defaultValue = "Your Age") String age,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("person", new Person());
        return "personPage1";
    }

    @PostMapping("/personPage1")
    public String personSubmit(@ModelAttribute Person person, Model model) {
        model.addAttribute("person", person);
        return "personPage2";
    }
}
