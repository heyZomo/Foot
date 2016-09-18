package com.skyids.smellfoot.base;

import com.skyids.smellfoot.callback.RequestCallBack;

import rx.Subscription;

/**
 * 作者：番茄汤加面 on 2016/9/14 08:30
 * 邮箱：15915786108@163.com
 */
public class PresenterImpl<T extends  IView,V> implements IPresenter ,RequestCallBack<V>{

    protected Subscription mSubscription;
    protected T mView;

    public PresenterImpl(T view){
        this.mView = view;
    }


    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        if (mSubscription != null && !mSubscription.isUnsubscribed()) {
            mSubscription.unsubscribe();
        }
        mView = null;
    }

    @Override
    public void beforeRequest() {

    }

    @Override
    public void requestSuccess(V data) {

    }

    @Override
    public void requestFial(String error) {

    }

    @Override
    public void requestComplete() {

    }
}
