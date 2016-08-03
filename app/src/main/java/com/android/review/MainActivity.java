package com.android.review;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;

import com.android.base.BaseActivity;
import com.lidroid.xutils.view.annotation.ViewInject;

public class MainActivity extends BaseActivity {

    @ViewInject(R.id.main_recyclerView)
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        viewListener();
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected void viewListener() {
        super.viewListener();
    }
}
