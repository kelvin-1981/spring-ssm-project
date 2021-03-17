package com.yykj.mybatis.common;

import com.yykj.mybatis.bean.Country;

public interface ICountryDao {

    public Country getCountryByCode(String code);
}
