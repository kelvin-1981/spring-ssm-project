package com.yykj.spring.mybatis.dao;

import com.yykj.spring.mybatis.bean.User;
import com.yykj.spring.mybatis.dao.IUserDao;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDao implements IUserDao {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUserList() {
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> users = userDao.getUserList();
        return users;
    }
}
