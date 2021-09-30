package com.hasan.thymeleaftemplateengine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model){
        model.addAttribute("name", "Hasanuzzaman");
        model.addAttribute("date", new Date().toString());
        return "about";
    }

    //handling iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model model){
        List<String> names = new ArrayList<>();
        names.add("Hasan");
        names.add("Shaon");
        names.add("Taijul");
        names.add("Nahian");
        names.add("Hreday");

        model.addAttribute("names", names);
        return "iterate";
    }
}
