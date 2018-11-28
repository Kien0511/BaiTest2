package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Weather implements IJSONArray{
    ArrayList<WeatherObject> list = new ArrayList<>();

    public ArrayList<WeatherObject> getList() {
        return list;
    }

    @Override
    public void array(JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.length(); i++)
        {
            JSONObject jsonObject = jsonArray.optJSONObject(i);

            WeatherObject weatherObject = new WeatherObject();

            weatherObject.setNumber(i);
            weatherObject.object(jsonObject);

            list.add(weatherObject);
        }
    }
}
