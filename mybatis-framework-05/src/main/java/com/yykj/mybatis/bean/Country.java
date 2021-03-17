package com.yykj.mybatis.bean;

public class Country {

    private String countryCode;
    private String countryName;
    private String region;

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

    public Country() {

    }

    public Country(String countryCode, String countryName, String region) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
