package com.yykj.ssm.dao;

import com.yykj.ssm.bean.Books;

import java.util.List;

public interface IBookDao {

    int addBook(Books book);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
