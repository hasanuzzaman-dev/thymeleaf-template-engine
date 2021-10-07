package com.hasan.thymeleaftemplateengine.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
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

    //Handler for conditional statements
    @GetMapping("/condition")
    public String conditionHandler(Model model){
        model.addAttribute("isActive", true);
        model.addAttribute("gender", "F");
        model.addAttribute("title", "This is Condition Page");
        model.addAttribute("subtitle", LocalDateTime.now().toString());
        List<Integer> integerList = new ArrayList<>();
        integerList.add(233);
        integerList.add(78);
        integerList.add(965);
        integerList.add(85);
        model.addAttribute("integerList", integerList);
        return "condition";
    }

    //Handler for including fragments
    @GetMapping("/service")
    public String serviceHandler(Model model){

        // processing logic
        model.addAttribute("title", "This is Service Page");
        model.addAttribute("subtitle", LocalDateTime.now().toString());
        return "service";
    }

    //for new about
    @GetMapping("/newAbout")
    public String newAbout(){
        return "aboutNew";
    }

    //for new about
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
