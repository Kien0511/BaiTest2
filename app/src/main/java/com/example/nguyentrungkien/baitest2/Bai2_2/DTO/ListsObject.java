package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import android.util.Log;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONObject;

import org.json.JSONObject;

public class ListsObject implements IJSONObject{
    long dt;
    Main main;
    Weather weather;
    Clouds clouds;
    Wind wind;
    Sys sys;
    String dt_txt;
    int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather getWeather() {
        return weather;
    }

    public ListsObject(long dt, Main main, Weather weather, Clouds clouds, Wind wind, Sys sys, String dt_txt, int number) {

        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.sys = sys;
        this.dt_txt = dt_txt;
        this.number = number;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public ListsObject() {

    }


    @Override
    public void object(JSONObject jsonObject) {
        setDt(jsonObject.optLong("dt"));
        Main main = new Main();
        main.object(jsonObject.optJSONObject("main"));
        setMain(main);


        Weather weather = new Weather();
        weather.array(jsonObject.optJSONArray("weather"));
        setWeather(weather);

        Clouds clouds = new Clouds();
        clouds.object(jsonObject.optJSONObject("clouds"));
        setClouds(clouds);

        Wind wind = new Wind();
        wind.object(jsonObject.optJSONObject("wind"));
        setWind(wind);

        Sys sys = new Sys();
        sys.object(jsonObject.optJSONObject("sys"));
        setSys(sys);
    }
}
