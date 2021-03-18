package com.yykj.mybatis.common;

import com.yykj.mybatis.bean.City;

import java.util.List;
import java.util.Map;

public interface ICityDao {

    public List<City> getCityListByCondition(Map<String,String> map);
}
