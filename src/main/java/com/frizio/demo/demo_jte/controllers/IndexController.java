package com.frizio.demo.demo_jte.controllers;

import com.frizio.demo.demo_jte.models.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("name", "Max");

        var items = List.of("Item 1", "Item 2", "Item 3");
        model.addAttribute("items", items);

        var page = new Page("Demo JTE", "Demo Java Template Engine");
        model.addAttribute("page", page);

        return "index";
    }

}
