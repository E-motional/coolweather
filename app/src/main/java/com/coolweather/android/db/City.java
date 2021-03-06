package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Wendy on 2017/12/4.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int procinceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProcinceId(){
        return procinceId;
    }

    public void setProcinceId(int procinceId){
        this.procinceId = procinceId;
    }
}
