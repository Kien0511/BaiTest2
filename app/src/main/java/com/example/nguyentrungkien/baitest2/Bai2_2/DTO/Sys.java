package com.example.nguyentrungkien.baitest2.Bai2_2.DTO;

import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONObject;

import org.json.JSONObject;

public class Sys implements IJSONObject{
    String pod;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public Sys() {

    }

    public Sys(String pod) {

        this.pod = pod;
    }

    @Override
    public void object(JSONObject jsonObject) {
        setPod(jsonObject.optString("pod"));
    }
}
