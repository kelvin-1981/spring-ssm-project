package com.yykj.mybatis.bean;

import java.util.List;

public class Country {

    private String countryCode;
    private String countryName;
    private String region;
    private List<City> cities;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Country(String countryCode, String countryName, String region, List<City> cities) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.region = region;
        this.cities = cities;
    }

    public Country() {

    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", region='" + region + '\'' +
                ", cities=" + cities +
                '}';
    }
}
