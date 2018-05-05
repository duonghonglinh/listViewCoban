package com.example.admin.listxoa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class traicayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<traicay> traicayList;

    public traicayAdapter(Context context, int layout, List<traicay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }


    //tra ve kich thuoc phan tu list
    @Override
    public int getCount() {
        return traicayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    //tao moi dung tra ve View
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // luc dau convertView la null
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);


        //axa View
        TextView txtTen = convertView.findViewById(R.id.txtTen);
        TextView txtMoTa = convertView.findViewById(R.id.txtMota);
        ImageView imageViewHinh = convertView.findViewById(R.id.imgHinh);

        //gan gia tri
        traicay traicay = traicayList.get(position);

        txtTen.setText(traicay.getTen());
        txtMoTa.setText(traicay.getMoTa());
        imageViewHinh.setImageResource(traicay.getHinh());


        return convertView;
    }





}
