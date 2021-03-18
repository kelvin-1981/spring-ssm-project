package com.yykj.mybatis.application;

import com.yykj.mybatis.bean.City;
import com.yykj.mybatis.common.ICityDao;
import com.yykj.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 实现查询数据类中包含集合
 */
public class TestMain07 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("CountryName", "A");
        map.put("District", "Kabol");

        SqlSession session = MybatisUtils.getSqlSession();
        ICityDao mapper = session.getMapper(ICityDao.class);
        List<City> cities = mapper.getCityListByCondition(map);

        for(City info : cities){
            System.out.println(info.toString());
        }

        session.close();
    }
}
