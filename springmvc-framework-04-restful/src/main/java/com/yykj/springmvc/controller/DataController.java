package com.yykj.springmvc.controller;

import com.yykj.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

    @GetMapping("/hello")
    public String hello(String name, Model model){
        model.addAttribute("msg",name);
        return "result";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        return "result";
    }


    @GetMapping("/user")
    public String user(User user, Model model){
        model.addAttribute("msg",user.toString());
        return "result";
    }

}
