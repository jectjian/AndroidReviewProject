package com.android.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Describe : 描述
 * Created by lvjian on 2016/8/3.
 * Email : jectjian@126.com
 */
public class BaseFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected void initView(){};

    protected void viewListener(){};
}
