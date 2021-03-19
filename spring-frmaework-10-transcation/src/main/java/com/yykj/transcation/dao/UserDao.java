package com.yykj.transcation.dao;

import com.yykj.transcation.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDao extends SqlSessionDaoSupport implements IUserDao {

    @Override
    public List<User> getUserList() {
        IUserDao userDao = getSqlSession().getMapper(IUserDao.class);
        return userDao.getUserList();
    }

    @Override
    public int insertUser(User user) {
        IUserDao userDao = getSqlSession().getMapper(IUserDao.class);
        return userDao.insertUser(user);
    }

    @Override
    public int deleteUser(int id) {
        IUserDao userDao = getSqlSession().getMapper(IUserDao.class);
        return userDao.deleteUser(id);
    }

    /**
     * 测试事务方法
     * @return
     */
    @Override
    public List<User> transcationUser() {
        IUserDao userDao = getSqlSession().getMapper(IUserDao.class);
        userDao.insertUser(new User(100, "U100", "P100"));
        //id 不存在
        userDao.deleteUser(1000);
        return userDao.getUserList();
    }
}
