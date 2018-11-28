package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONObject;

import org.json.JSONObject;

public class Wind implements IJSONObject {
    Double speed;
    Double deg;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }

    public Wind() {

    }

    public Wind(Double speed, Double deg) {

        this.speed = speed;
        this.deg = deg;
    }

    @Override
    public void object(JSONObject jsonObject) {
        setSpeed(jsonObject.optDouble("speed"));
        setDeg(jsonObject.optDouble("deg"));
    }
}
