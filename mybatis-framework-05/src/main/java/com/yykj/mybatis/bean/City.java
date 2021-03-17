package com.yykj.mybatis.bean;

public class City {

    private String cityCode;
    private String cityName;
    private String district;
    private Country country;

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City() {

    }

    public City(String cityCode, String cityName, String district, Country country) {
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.district = district;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                ", district='" + district + '\'' +
                ", country=" + country +
                '}';
    }
}
