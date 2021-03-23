package com.yykj.ssm.controller;

import com.yykj.ssm.bean.Books;
import com.yykj.ssm.service.BookService;
import com.yykj.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookService")
    private IBookService bookService;

    @RequestMapping("/all")
    public String queryAllBook(Model model){
        List<Books> books = bookService.queryAllBook();
        System.out.println(books.toString());
        model.addAttribute("msg",books.toString());
        return "result";
    }
}
