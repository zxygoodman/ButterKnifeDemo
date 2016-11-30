package com.feicui.butterknifedemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/30 0030.
 */

public class MyAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent);

        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.tv_show)
        TextView tvShow;
        @BindView(R.id.btn_show)
        Button btnShow;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
