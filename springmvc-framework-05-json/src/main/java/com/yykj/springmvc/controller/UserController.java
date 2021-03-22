package com.yykj.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yykj.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * Jackson工具完成Json数据转换(对象格式)
     * 浏览器：localhost:8080/user/j1
     * @return
     * @throws JsonProcessingException
     */
    @ResponseBody
    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    public String jsonJackson() throws JsonProcessingException {
        // TODO: 1.创建对象
        User user = new User(1, "张鹏", 25);
        // TODO: 2.jackson 将对象转换为json字符串
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(user);
        // TODO: 2.直接返回字符串显示
        return jsonStr;
    }

    /**
     * Jackson工具完成Json数据转换(对象集合格式)
     * 浏览器：localhost:8080/user/j2
     * @return
     * @throws JsonProcessingException
     */
    @ResponseBody
    @RequestMapping(value = "/j2")
    public String jsonJackson2() throws JsonProcessingException {
        // TODO: 1.创建对象集合
        User user = new User(1, "张鹏1", 25);
        User user2 = new User(1, "张鹏2", 25);
        User user3 = new User(1, "张鹏3", 25);
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        list.add(user3);

        // TODO: 2.jackson 将对象转换为json字符串
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(list);
        // TODO: 2.直接返回字符串显示
        return jsonStr;
    }

    /**
     * Fastjson工具完成Json数据转换(对象集合格式)
     * 浏览器：localhost:8080/user/j3
     * @return
     */
    @ResponseBody
    @RequestMapping("/j3")
    public String jsonFastjson(){
        // TODO: 1.创建对象集合
        User user1 = new User(1, "张鹏1", 25);
        User user2 = new User(2, "张鹏2", 25);
        User user3 = new User(3, "张鹏3", 25);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // TODO: 2.Fastjson 将对象转换为json字符串
        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);

        return JSON.toJSONString(list);
    }
}
