package com.skyids.smellfoot.moudle.menu.model;

import com.skyids.smellfoot.callback.RequestCallBack;

import rx.Subscription;

/**
 * 作者：番茄汤加面 on 2016/9/14 08:25
 * 邮箱：15915786108@163.com
 */
public interface IMenuList<T> {

    Subscription requestMenuList(RequestCallBack<T> callBack,String url);

}
