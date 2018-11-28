package com.example.nguyentrungkien.baitest2.Bai2_1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.nguyentrungkien.baitest2.Bai2_1.Adapter.StudentAdapter;
import com.example.nguyentrungkien.baitest2.Bai2_1.DTO.StudentDTO;
import com.example.nguyentrungkien.baitest2.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bai2_1 extends AppCompatActivity {

    private RecyclerView rcvListStudent;
    private ArrayList<StudentDTO> list;
    private StudentDTO studentDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_1);
        rcvListStudent = findViewById(R.id.rcvListStudent);
        list = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcvListStudent.setLayoutManager(linearLayoutManager);

        try {
            String data = getDataJson(this,R.raw.data);
            JSONObject jsonRoot = new JSONObject(data);

            JSONArray jsonArrayStudent = jsonRoot.optJSONArray(jsonRoot.names().get(0).toString());

            for (int i = 0; i < jsonArrayStudent.length(); i++)
            {
                JSONObject object = jsonArrayStudent.optJSONObject(i);
                studentDTO = new StudentDTO();
                studentDTO.setName(object.optString("name"));
                studentDTO.setAge(object.optInt("age"));
                studentDTO.setCity(object.optString("city"));
                list.add(studentDTO);
            }

            StudentAdapter adapter = new StudentAdapter(this,list);
            rcvListStudent.setAdapter(adapter);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getDataJson(Context context, int resId) throws IOException {
        InputStream inputStream = context.getResources().openRawResource(resId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        String line = null;

        while ((line = reader.readLine()) != null)
        {
            builder.append(line);
        }

        return builder.toString();
    }
}
