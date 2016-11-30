package com.feicui.butterknifedemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/11/30 0030.
 */

public class MyFragment extends Fragment {

    @BindView(R.id.tv_show)
    TextView tvShow;
    @BindView(R.id.btn_show)
    Button btnShow;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.tv_show,R.id.btn_show})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_show:
                break;
            case R.id.btn_show:
                break;
        }
    }
}
