package com.example.nguyentrungkien.baitest2.Bai2_2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nguyentrungkien.baitest2.Bai2_2.DTO.ListsObject;
import com.example.nguyentrungkien.baitest2.R;

import java.util.ArrayList;

public class ListsAdapter extends RecyclerView.Adapter<ListsAdapter.ViewHolder>{

    Context context;
    ArrayList<ListsObject> list;
    boolean checkNumber = false;
    boolean checkMain = false;
    boolean checkWeather = false;
    boolean checkClouds = false;
    boolean checkWind = false;
    boolean checkSys = false;


    public ListsAdapter(Context context, ArrayList<ListsObject> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_parse_json,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.txtNumber.setText(list.get(position).getNumber()+"");
        holder.txtDt.setText(list.get(position).getDt()+"");
        holder.txtTemp.setText(list.get(position).getMain().getTemp()+"");
        holder.txtTemp_min.setText(list.get(position).getMain().getTemp_min()+"");
        holder.txtTemp_max.setText(list.get(position).getMain().getTemp_max()+"");
        holder.txtPressure.setText(list.get(position).getMain().getPressure()+"");
        holder.txtSea_level.setText(list.get(position).getMain().getSea_level()+"");
        holder.txtGrnd_level.setText(list.get(position).getMain().getGrnd_level()+"");
        holder.txtHumidity.setText(list.get(position).getMain().getHumidity()+"");
        holder.txtTemp_kf.setText(list.get(position).getMain().getTemp_kf()+"");
        holder.txtWeatherNumber.setText(list.get(position).getWeather().getList().get(0).getNumber()+"");
        holder.txtWeatherId.setText(list.get(position).getWeather().getList().get(0).getId()+"");
        holder.txtWeatherMain.setText(list.get(position).getWeather().getList().get(0).getMain()+"");
        holder.txtWeatherDescription.setText(list.get(position).getWeather().getList().get(0).getDescription()+"");
        holder.txtWeatherIcon.setText(list.get(position).getWeather().getList().get(0).getIcon()+"");
        holder.txtCloudsAll.setText(list.get(position).getClouds().getAll()+"");
        holder.txtWindSpeed.setText(list.get(position).getWind().getSpeed()+"");
        holder.txtWindDeg.setText(list.get(position).getWind().getDeg()+"");
        holder.txtSysPod.setText(list.get(position).getSys().getPod()+"");
        holder.txtDt_txt.setText(list.get(position).getDt_txt());

        holder.txtNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNumber = !checkNumber;
                if(checkNumber)
                {
                    holder.NumberState(View.VISIBLE);
                }
                else
                {
                    holder.NumberState(View.GONE);
                }
            }
        });

        holder.txtMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkMain = !checkMain;
                if(checkMain)
                {
                    holder.MainState(View.VISIBLE);
                }
                else
                {
                    holder.MainState(View.GONE);
                }
            }
        });

        holder.txtWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWeather = !checkWeather;
                if(checkWeather)
                {
                    holder.WeatherState(View.VISIBLE);
                }
                else
                {
                    holder.WeatherState(View.GONE);
                }
            }
        });

        holder.txtWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWind = !checkWind;
                if(checkWind)
                {
                    holder.WindState(View.VISIBLE);
                }
                else
                {
                    holder.WindState(View.GONE);
                }
            }
        });

        holder.txtClouds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkClouds = !checkClouds;
                if(checkClouds)
                {
                    holder.CloudsState(View.VISIBLE);
                }
                else
                {
                    holder.CloudsState(View.GONE);
                }
            }
        });

        holder.txtSys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkSys = !checkSys;
                if(checkSys)
                {
                    holder.SysState(View.VISIBLE);
                }
                else
                {
                    holder.SysState(View.GONE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNumber, txtDt, txtTemp, txtTemp_min, txtTemp_max, txtPressure, txtSea_level, txtGrnd_level, txtHumidity;
        TextView txtTemp_kf, txtWeatherNumber, txtWeatherId, txtWeatherMain, txtWeatherDescription, txtWeatherIcon;
        TextView txtCloudsAll, txtWindSpeed, txtWindDeg, txtSysPod, txtDt_txt;

        TextView txtMain, txtWeather, txtClouds, txtWind, txtSys;

        LinearLayout ln_Number, ln_Main, ln_Weather, ln_Clouds, ln_Wind, ln_Sys;

        public ViewHolder(View itemView) {
            super(itemView);
            ln_Number = itemView.findViewById(R.id.ln_number);
            ln_Main = itemView.findViewById(R.id.ln_main);
            ln_Weather = itemView.findViewById(R.id.ln_weather);
            ln_Clouds = itemView.findViewById(R.id.ln_Clouds);
            ln_Wind = itemView.findViewById(R.id.ln_Wind);
            ln_Sys = itemView.findViewById(R.id.ln_Sys);

            txtMain = itemView.findViewById(R.id.txtMain);
            txtWeather = itemView.findViewById(R.id.txtWeather);
            txtClouds = itemView.findViewById(R.id.txtClouds);
            txtWind = itemView.findViewById(R.id.txtWind);
            txtSys = itemView.findViewById(R.id.txtSys);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            txtDt = itemView.findViewById(R.id.txtDt);
            txtTemp = itemView.findViewById(R.id.txttemp);
            txtTemp_min = itemView.findViewById(R.id.txttemp_min);
            txtTemp_max = itemView.findViewById(R.id.txttemp_max);
            txtPressure = itemView.findViewById(R.id.txtpressure);
            txtSea_level = itemView.findViewById(R.id.txtsea_level);
            txtGrnd_level = itemView.findViewById(R.id.txtgrnd_level);
            txtHumidity = itemView.findViewById(R.id.txthumidity);
            txtTemp_kf = itemView.findViewById(R.id.txttemp_kf);
            txtWeatherNumber = itemView.findViewById(R.id.txtWeatherNumber);
            txtWeatherId = itemView.findViewById(R.id.txtWeatherId);
            txtWeatherMain = itemView.findViewById(R.id.txtWeatherMain);
            txtWeatherDescription = itemView.findViewById(R.id.txtWeatherDescription);
            txtWeatherIcon = itemView.findViewById(R.id.txtWeatherIcon);
            txtCloudsAll = itemView.findViewById(R.id.txtCloudsAll);
            txtWindSpeed = itemView.findViewById(R.id.txtWindSpeed);
            txtWindDeg = itemView.findViewById(R.id.txtWindDeg);
            txtSysPod = itemView.findViewById(R.id.txtSysPod);
            txtDt_txt = itemView.findViewById(R.id.txtDt_txt);
        }

        public void MainState(int state)
        {
            ln_Main.setVisibility(state);
        }

        public void WeatherState(int state)
        {
            ln_Weather.setVisibility(state);
        }

        public void CloudsState(int state)
        {
            ln_Clouds.setVisibility(state);
        }

        public void WindState(int state)
        {
            ln_Wind.setVisibility(state);
        }

        public void SysState(int state)
        {
           ln_Sys.setVisibility(state);
        }

        public void NumberState(int state)
        {
            ln_Number.setVisibility(state);
        }
    }


}
