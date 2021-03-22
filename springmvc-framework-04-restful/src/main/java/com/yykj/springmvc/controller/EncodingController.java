package com.yykj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @PostMapping("e/p/")
    public String postEncoding(String name, Model model){
        model.addAttribute("msg",name);
        return "result";
    }
}
