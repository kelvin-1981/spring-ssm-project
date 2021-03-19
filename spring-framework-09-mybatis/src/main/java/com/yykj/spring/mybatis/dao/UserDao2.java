package com.yykj.spring.mybatis.dao;

import com.yykj.spring.mybatis.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDao2 extends SqlSessionDaoSupport implements IUserDao {

    @Override
    public List<User> getUserList() {
        SqlSession session = this.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        return userDao.getUserList();
    }
}
