package com.example.my_first_spring_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/hyper1")
    public String myMethod1(@RequestParam(name="hyper1", required = false) String hyper1, Model model) {
        // the view knows this and will display the html
        model.addAttribute("hyper1", hyper1);
        return "hyper1";
    }

    @GetMapping("/hyper2")
    public String myMethod2(@RequestParam(name="hyper2", required = false) String hyper2, Model model) {
        // the view knows this and will display the html
        model.addAttribute("hyper1", hyper2);
        return "hyper2";
    }

    @GetMapping("/hyper3")
    public String myMethod3(@RequestParam(name="hyper3", required = false) String hyper3, Model model) {
        // the view knows this and will display the html
        model.addAttribute("hyper1", hyper3);
        return "hyper3";
    }
}
