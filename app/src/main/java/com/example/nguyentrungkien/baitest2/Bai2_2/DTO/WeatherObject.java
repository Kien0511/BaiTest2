package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONObject;

import org.json.JSONObject;

public class WeatherObject implements IJSONObject{
    int id;
    String main;
    String description;
    String icon;

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public WeatherObject() {

    }

    public WeatherObject(int id, String main, String description, String icon, int number) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
        this.number = number;
    }

    @Override
    public void object(JSONObject jsonObject) {
        setId(jsonObject.optInt("id"));
        setMain(jsonObject.optString("main"));
        setDescription(jsonObject.optString("description"));
        setIcon(jsonObject.optString("icon"));
    }
}
