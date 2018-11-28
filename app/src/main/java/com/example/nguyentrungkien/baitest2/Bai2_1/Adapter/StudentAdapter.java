package com.example.nguyentrungkien.baitest2.Bai2_1.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentrungkien.baitest2.Bai2_1.DTO.StudentDTO;
import com.example.nguyentrungkien.baitest2.R;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>{

    Context context;
    ArrayList<StudentDTO> list;

    public StudentAdapter(Context context, ArrayList<StudentDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_student,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(list.get(position).getName());
        holder.txtAge.setText(list.get(position).getAge()+"");
        holder.txtCity.setText(list.get(position).getCity());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName, txtAge, txtCity;
        public ViewHolder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtAge = itemView.findViewById(R.id.txtAge);
            txtCity = itemView.findViewById(R.id.txtCity);
        }
    }
}
