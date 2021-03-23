package com.yykj.ssm.dao;

import com.yykj.ssm.bean.Books;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookDao")
public class BookDao extends SqlSessionDaoSupport implements IBookDao {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int addBook(Books book) {
        return getSqlSession().getMapper(IBookDao.class).addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return getSqlSession().getMapper(IBookDao.class).deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return getSqlSession().getMapper(IBookDao.class).updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return getSqlSession().getMapper(IBookDao.class).queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return getSqlSession().getMapper(IBookDao.class).queryAllBook();
    }
}
