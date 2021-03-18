package com.yykj.mybatis.bean;

public class City {

    private String cityCode;
    private String cityName;
    private String district;
    private String countryCode;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public City() {
    }

    public City(String cityCode, String cityName, String district, String countryCode) {
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.district = district;
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                ", district='" + district + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
