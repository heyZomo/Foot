package com.skyids.smellfoot.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：番茄汤加面 on 2016/9/7 19:00
 * 邮箱：15915786108@163.com
 */
public abstract  class BaseFragment<T extends IPresenter> extends android.support.v4.app.Fragment {

    protected FragmentActivity mActivity;
    protected String loadId;
    protected T mPresenter;

    public BaseFragment(){

    }

    public BaseFragment(String id){
        this.loadId = id;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return onInitView();
    }

    /**
     * 视图
     * @return
     */
    protected abstract View onInitView();
}
