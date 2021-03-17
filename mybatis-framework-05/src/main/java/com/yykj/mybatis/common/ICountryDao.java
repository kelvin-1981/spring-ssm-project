package com.yykj.mybatis.common;

import com.yykj.mybatis.bean.Country;

import java.util.List;

public interface ICountryDao {

    public List<Country> getCountryList();

    public Country getCountryByCode(String code);
}
