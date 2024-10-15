package org.example.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController//первый вариант
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHome(@RequestParam(name = "name", required = false, defaultValue = "World")
                          String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }
}