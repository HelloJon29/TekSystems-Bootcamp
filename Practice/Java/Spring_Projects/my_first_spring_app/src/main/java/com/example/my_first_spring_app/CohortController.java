package com.example.my_first_spring_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CohortController {

    @GetMapping("/cohort/java")
    public String cohort(@RequestParam(name="week", required=false, defaultValue="1") String week, @RequestParam(name="topic", required = false, defaultValue = "java") String topic, Model model) {
        // the view and the html knows about this model and its attribute can use ${xx} notation in html to get values from this
        model.addAttribute("week", week);
        model.addAttribute("topic", topic);
        return "cohort";
    }
}
