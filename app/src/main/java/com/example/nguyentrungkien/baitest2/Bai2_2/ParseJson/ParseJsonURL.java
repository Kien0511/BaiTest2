package com.example.nguyentrungkien.baitest2.Bai2_2.ParseJson;

import android.os.AsyncTask;

import com.example.nguyentrungkien.baitest2.Bai2_2.DTO.Lists;
import com.example.nguyentrungkien.baitest2.Bai2_2.DTO.ListsObject;
import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IJSONArray;
import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ParseJsonURL extends AsyncTask<String, Void, String> {
    IService iService;
    public ParseJsonURL(IService iService) {
        this.iService = iService;
    }

    @Override
    protected String doInBackground(String... strings) {
        String URLParse = "https://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22";

        try {
            URL url = new URL(URLParse);

            URLConnection connection = url.openConnection();

            InputStream inputStream = connection.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null)
            {
                builder.append(line);
            }

            return builder.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        try {
            JSONObject jsonRoot = new JSONObject(s);
            JSONArray jsonList = jsonRoot.optJSONArray("list");


            Lists lists = new Lists();
            lists.array(jsonList);

            iService.parseJson(lists);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
