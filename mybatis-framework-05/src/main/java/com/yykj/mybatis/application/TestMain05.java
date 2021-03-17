package com.yykj.mybatis.application;

import com.yykj.mybatis.bean.City;
import com.yykj.mybatis.common.ICityDao;
import com.yykj.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 查询所有城市信息及对应的国家信息
 */
public class TestMain05 {

    public static void main(String[] args) {

        SqlSession session = MybatisUtils.getSqlSession();
        ICityDao mapper = session.getMapper(ICityDao.class);
        List<City> cityList = mapper.getCityList();

        for(City info: cityList){
            System.out.println(info.toString());
        }

        session.close();
    }
}
