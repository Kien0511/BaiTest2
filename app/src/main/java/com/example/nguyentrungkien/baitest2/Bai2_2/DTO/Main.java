package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import android.util.Log;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONObject;

import org.json.JSONObject;

public class Main implements IJSONObject{
    Double temp;
    Double temp_min;
    Double temp_max;
    Double pressure;
    Double sea_level;
    Double grnd_level;
    Double humidity;
    Double temp_kf;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Double temp_min) {
        this.temp_min = temp_min;
    }

    public Double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Double temp_max) {
        this.temp_max = temp_max;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getSea_level() {
        return sea_level;
    }

    public void setSea_level(Double sea_level) {
        this.sea_level = sea_level;
    }

    public Double getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(Double grnd_level) {
        this.grnd_level = grnd_level;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getTemp_kf() {
        return temp_kf;
    }

    public void setTemp_kf(Double temp_kf) {
        this.temp_kf = temp_kf;
    }

    public Main(Double temp, Double temp_min, Double temp_max, Double pressure, Double sea_level, Double grnd_level, Double humidity, Double temp_kf) {

        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
        this.humidity = humidity;
        this.temp_kf = temp_kf;
    }

    public Main() {

    }

    @Override
    public void object(JSONObject jsonObject) {
        setTemp(jsonObject.optDouble("temp"));
        setTemp_min(jsonObject.optDouble("temp_min"));
        setTemp_max(jsonObject.optDouble("temp_max"));
        setPressure(jsonObject.optDouble("pressure"));
        setSea_level(jsonObject.optDouble("sea_level"));
        setGrnd_level(jsonObject.optDouble("grnd_level"));
        setHumidity(jsonObject.optDouble("humidity"));
        setTemp_kf(jsonObject.optDouble("temp_kf"));
    }
}
