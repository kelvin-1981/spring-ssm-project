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
 * 1.实现实体类与数据库字段不一致问题
 * 1.1 方法一: SQL语句中字段起别名
 * 1.2 方法二: 结果集映射
 */
public class TestMain {

    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // TODO: 1.获取全部用户列表
        getUserList();

        System.out.println("------------------------------------");

        // TODO: 2.根据ID获取用户信息
        getUserByID();
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
