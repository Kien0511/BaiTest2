package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONObject;

import org.json.JSONObject;

public class Clouds implements IJSONObject{
    String all;

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public Clouds() {

    }

    public Clouds(String all) {

        this.all = all;
    }

    @Override
    public void object(JSONObject jsonObject) {
        setAll(jsonObject.optString("all"));
    }
}
