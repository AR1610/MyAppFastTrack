package com.myappfasttrack.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myappfasttrack.R;
import com.myappfasttrack.model.LangModel;

import java.util.ArrayList;

public class MyBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<LangModel> langModelArrayList;

    public MyBaseAdapter(Context context, ArrayList<LangModel> langModelArrayList) {
       this.context = context;
       this.langModelArrayList = langModelArrayList;

    }

    @Override
    public int getCount() {
        return langModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return langModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.raw_cutm_list,null);
        ImageView imgData = view.findViewById(R.id.img_data);
        TextView tvData = view.findViewById(R.id.tv_data);
        imgData.setImageResource(langModelArrayList.get(i).getImgLang());
        tvData.setText(langModelArrayList.get(i).getStrLang());

        return view;
    }
}
