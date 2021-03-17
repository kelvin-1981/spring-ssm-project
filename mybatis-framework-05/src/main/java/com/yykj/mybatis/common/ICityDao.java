package com.yykj.mybatis.common;

import com.yykj.mybatis.bean.City;

import java.util.List;

public interface ICityDao {

    public List<City> getCityList();

    public City getCityByCode(String code);

}
