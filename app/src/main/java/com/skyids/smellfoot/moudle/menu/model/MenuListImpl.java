package com.skyids.smellfoot.moudle.menu.model;

import com.skyids.smellfoot.callback.RequestCallBack;
import com.skyids.smellfoot.moudle.menu.bean.MenuModel;
import com.skyids.smellfoot.netapi.ApiManager;
import com.skyids.smellfoot.utils.RxHelper;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 作者：番茄汤加面 on 2016/9/15 08:42
 * 邮箱：15915786108@163.com
 */
public class MenuListImpl implements IMenuList<List<MenuModel>> {

    private RequestCallBack<List<MenuModel>> callBack;

    @Override
    public Subscription requestMenuList(RequestCallBack<List<MenuModel>> callBack, String url) {
        this.callBack = callBack;
        callBack.beforeRequest();
        return ApiManager.getMenuApi().list(url)
                .subscribeOn(Schedulers.io())
                .compose(RxHelper.<MenuModel>handleResult())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }


    /**
     * 观察者
     */
    private Observer<List<MenuModel>> observer = new Observer<List<MenuModel>>() {
        @Override
        public void onCompleted() {
        }

        @Override
        public void onError(Throwable e) {
            if (callBack != null) {
                callBack.requestFial(e.getMessage());
            }
        }

        @Override
        public void onNext(List<MenuModel> menuModels) {
            if (callBack != null) {
                callBack.requestSuccess(menuModels);
            }
        }
    };

}
