package com.yykj.ssm.controller;

import com.yykj.ssm.bean.Books;
import com.yykj.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookService")
    private IBookService bookService;

    /**
     * 获取全部数据
     * URL：http://localhost:8080/book/allBook
     * @param model
     * @return
     */
    @RequestMapping("/allBook")
    public String queryAllBook(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    /**
     * 转向新增图书页面
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    /**
     * 新增图书信息
     * @param books
     * @return
     */
    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    /**
     * 更改书籍信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books );
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }

    /**
     * 删除图书
     * @param bookID
     * @return
     */
    @RequestMapping(value = "/del/{bookID}")
    public String deleteBookById(@PathVariable int bookID){
        bookService.deleteBookById(bookID);
        return "redirect:/book/allBook";
    }
}
