package com.android.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Describe : Activity的基类
 * Created by lvjian on 2016/8/3.
 * Email : jectjian@126.com
 */
public class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void initView(){};

    protected void viewListener(){};
}
