package com.yykj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    /**
     * 之前的url调用方法
     * @param x1
     * @param x2
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String testRestful(int x1, int x2, Model model){
        int sum = x1 + x2;
        model.addAttribute("msg", "sum= " + sum);
        return "result";
    }

    /**
     * Restful的url调用方法
     * http://localhost:8080/add2/1/2
     * @param x1
     * @param x2
     * @param model
     * @return
     */
    @RequestMapping("/add2/{x1}/{x2}")
    public String testRestful02(@PathVariable int x1, @PathVariable int x2, Model model){
        int sum = x1 + x2;
        model.addAttribute("msg", "sum= " + sum);
        return "result";
    }

    /**
     * Restful的url调用方法
     * http://localhost:8080/add2/1/2
     * @param x1
     * @param x2
     * @param model
     * @return
     */
    //@GetMapping
    //@PostMapping
    //@DeleteMapping
    @RequestMapping(value = "/add3/{x1}/{x2}",method = RequestMethod.POST)
    public String testRestful03(@PathVariable int x1, @PathVariable int x2, Model model){
        int sum = x1 + x2;
        model.addAttribute("msg", "sum= " + sum);
        return "result";
    }

    @PostMapping("/add4/{x1}/{x2}")
    public String testRestful04(@PathVariable int x1, @PathVariable int x2, Model model){
        int sum = x1 + x2;
        model.addAttribute("msg", "sum= " + sum);
        return "result";
    }
}
