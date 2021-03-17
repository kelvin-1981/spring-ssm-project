package com.yykj.mybatis.common;

import com.yykj.mybatis.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface IUserDao {

    @Select("select * from user")
    public List<User> getUserList();

    @Select("select * from user where id = ${id}")
    public User getUserByID(int id);

    @Insert("insert into user(name,pwd) values(#{name},#{pwd})")
    public int insertUser(User user);

    @Update("update user set name = #{name}, pwd = #{pwd} where id = #{id}")
    public int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    public int deleteUser(int id);
}
