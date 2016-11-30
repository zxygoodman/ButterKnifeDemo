package com.feicui.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    //绑定View
    @BindView(R.id.tv_show)
    TextView textView;
    @BindView(R.id.btn_show)
    Button button;
    //绑定资源
    @BindString(R.string.app_name)
    String name;
    @BindView(R.id.lv_list)
    ListView lvList;

    private Unbinder bind;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind = ButterKnife.bind(this);
        list = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add("测试数据" + i);
        }
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lvList.setAdapter(adapter);
    }

    @OnClick(R.id.btn_show)
    public void setTextFun() {
        textView.setText(name);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }


    @OnItemClick(R.id.lv_list)
    public void onClick(int position) {
        Toast.makeText(this, "点击第"+position+"条", Toast.LENGTH_SHORT).show();
    }
}
