package org.example.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController//первый вариант
@Controller
@RequestMapping//("/mypage")
public class HomeController {

    @GetMapping(value = "/mypage")
    String getpage() {
        return "myfile.html";
    }
}


/*    @RequestMapping("/myfile")
    @GetMapping(value = "/myfile")
    public String getMyfile_search(@RequestParam(name = "name", required = false, defaultValue = "myfile")
                                 String name, Model model) {
        model.addAttribute("name", name);
        return "myfile";
    }

    @RequestMapping("/search")
    public String getHome_search(@RequestParam(name = "name", required = false, defaultValue = "search")
                          String name, Model model) {
        model.addAttribute("name", name);
        return "search";
    }

    @RequestMapping("/search2")
    public String getHome_search2(@RequestParam(name = "name", required = false, defaultValue = "search2")
                                 String name, Model model) {
        model.addAttribute("name", name);
        return name;//"name";
    }

    @RequestMapping("/index")
    public String getHome_index(@RequestParam(name = "name", required = false, defaultValue = "index")
                                  String name, Model model) {
        model.addAttribute("name", name);
        return name;//"name";
    }

    @RequestMapping("/home")
    public String getHome_home(@RequestParam(name = "name", required = false, defaultValue = "home")
                               String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @RequestMapping("/ivan")
    public String getHome_ivan(@RequestParam(name = "name", required = false, defaultValue = "ivan")
                          String name, Model model) {
        model.addAttribute("name", name);
        return "ivan";
    }
}

 */