package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import android.util.Log;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Lists implements IJSONArray {

    ArrayList<ListsObject> list = new ArrayList<>();

    public ArrayList<ListsObject> getList() {
        return list;
    }

    @Override
    public void array(JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.length(); i++)
        {
            JSONObject jsonObject = jsonArray.optJSONObject(i);

            ListsObject listsObject = new ListsObject();

            listsObject.object(jsonObject);
            Log.e("caccc",i +" " + String.valueOf(jsonObject.names()));

            list.add(listsObject);
        }
    }
}
