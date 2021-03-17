package com.yykj.mybatis.application;

import com.yykj.mybatis.bean.User;
import com.yykj.mybatis.common.IUserDao;
import com.yykj.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mybatis：可以理解成为Dao层内容
 * 1.实现注解开发操作 增删改查
*/
public class TestMain04 {

    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // TODO: 1.获取全部用户列表
        //getUserList();

        // TODO: 2.根据ID获取用户信息
        //getUserByID();

        // TODO: 3.新建用户信息
        //insertUser();

        // TODO: 4.更改用户信息
        //updateUser();

        // TODO: 5.删除用户信息
        deleteUser();
    }

    /**
     * 删除用户信息
     */
    private static void deleteUser() throws IOException {

        SqlSession session = MyBatisUtils.getSqlSession();
        IUserDao mapper = session.getMapper(IUserDao.class);
        int cnt = mapper.deleteUser(12);

        System.out.println(cnt);

        // TODO: 需要提交事务
        session.commit();
        session.close();
    }

    /**
     * 更改用户信息
     */
    private static void updateUser() throws IOException {

        User info = new User(12, "U100", "100");

        SqlSession session = MyBatisUtils.getSqlSession();
        IUserDao mapper = session.getMapper(IUserDao.class);
        int cnt = mapper.updateUser(info);

        System.out.println(cnt);

        // TODO: 需要提交事务
        session.commit();
        session.close();
    }

    /**
     * 新建用户信息
     */
    private static void insertUser() throws IOException {

        User info = new User(1, "333", "444");

        SqlSession session = MyBatisUtils.getSqlSession();
        IUserDao mapper = session.getMapper(IUserDao.class);
        int cnt = mapper.insertUser(info);

        System.out.println(cnt);

        // TODO: 需要提交事务
        session.commit();
        session.close();
    }

    /**
     * 根据ID获取用户信息
     */
    private static void getUserByID() throws IOException {
        SqlSession session = MyBatisUtils.getSqlSession();

        IUserDao mapper = session.getMapper(IUserDao.class);
        User user = mapper.getUserByID(1);
        System.out.println(user.toString());

        session.close();
    }

    /**
     * 获取全部用户列表
     */
    public static void getUserList() throws IOException {
        // TODO: 1.获取sqlSession
        SqlSession session = MyBatisUtils.getSqlSession();

        // TODO: 2.映射mapper
        IUserDao mapper = session.getMapper(IUserDao.class);
        List<User> users = mapper.getUserList();

        // TODO: 3.输出
        for(User info: users){
            System.out.println(info.toString());
        }

        // TODO: 4.关闭session
        session.close();
    }
}
