package org.example.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = "search")
public class SearchController {

    @GetMapping
    String getPage() {
        return "search.html";
    }

    @PostMapping
    String search(/*@RequestMapping*/ Map<String, String> allParams) {
        //дальше сами, debugger всё подскажет :)
        return allParams.toString();
    }
}
