package com.example.my_first_spring_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, @RequestParam(name="age", required = false, defaultValue = "10") String age, Model model) {
        // the view and the html knows about this model and its attribute can use ${xx} notation in html to get values from this
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "greeting";
    }

    @GetMapping("/goodbye")
    public String goodbye(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // the view and the html knows about this model and its attribute can use ${xx} notation in html to get values from this
        model.addAttribute("name", name);
        return "goodbye";
    }

}
