package com.example.nguyentrungkien.baitest2.Bai2_2;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.nguyentrungkien.baitest2.Bai2_2.Adapter.ListsAdapter;
import com.example.nguyentrungkien.baitest2.Bai2_2.DTO.Lists;
import com.example.nguyentrungkien.baitest2.Bai2_2.DTO.ListsObject;
import com.example.nguyentrungkien.baitest2.Bai2_2.JSON_Interface.IService;
import com.example.nguyentrungkien.baitest2.Bai2_2.ParseJson.ParseJsonURL;
import com.example.nguyentrungkien.baitest2.R;

import java.util.ArrayList;


public class Bai2_2 extends AppCompatActivity implements IService{

    ParseJsonURL parseJsonURL;
    ProgressDialog dialog;
    RecyclerView rcvList;
    ArrayList<ListsObject> list;
    TextView txtList;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_2);

        rcvList = findViewById(R.id.rcvList);
        txtList = findViewById(R.id.txtList);

        parseJsonURL = new ParseJsonURL(Bai2_2.this);
        parseJsonURL.execute();

        dialog = new ProgressDialog(Bai2_2.this);
        dialog.setMessage("Loading.....");
        dialog.show();

        txtList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = !check;
                if(check)
                {
                    rcvList.setVisibility(View.VISIBLE);
                }
                else
                {
                    rcvList.setVisibility(View.GONE);
                }
            }
        });
    }


    @Override
    public void parseJson(Lists lists) {
        dialog.hide();
        list = new ArrayList<>();

        LinearLayoutManager layoutManager = new LinearLayoutManager(Bai2_2.this,LinearLayoutManager.VERTICAL,false);
        rcvList.setLayoutManager(layoutManager);

        for (int i = 0; i < lists.getList().size(); i++)
        {
            ListsObject listsObject = lists.getList().get(i);

            listsObject.setNumber(i);

            list.add(listsObject);
        }

        ListsAdapter adapter = new ListsAdapter(Bai2_2.this,list);
        rcvList.setAdapter(adapter);
    }
}
