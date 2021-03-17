package com.yykj.mybatis.application;

import com.yykj.mybatis.bean.Country;
import com.yykj.mybatis.common.ICountryDao;
import com.yykj.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 *
 */
public class TestMain06 {
    public static void main(String[] args) {
        SqlSession session = MybatisUtils.getSqlSession();

        ICountryDao mapper = session.getMapper(ICountryDao.class);
        Country info = mapper.getCountryByCode("AGO");
        System.out.println(info.toString());

        session.close();
    }
}
