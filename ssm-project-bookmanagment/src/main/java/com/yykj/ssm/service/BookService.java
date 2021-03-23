package com.yykj.ssm.service;

import com.yykj.ssm.bean.Books;
import com.yykj.ssm.dao.BookDao;
import com.yykj.ssm.dao.IBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookService implements IBookService{

    @Autowired
    @Qualifier("bookDao")
    private IBookDao bookDao;

    @Override
    public int addBook(Books book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookDao.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
