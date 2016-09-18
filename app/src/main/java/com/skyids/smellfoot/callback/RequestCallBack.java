package com.skyids.smellfoot.callback;

/**
 * 作者：番茄汤加面 on 2016/9/14 08:36
 * 邮箱：15915786108@163.com
 */
public interface RequestCallBack<T> {

    /**
     * 请求之前调用
     */
    void beforeRequest();

    /**
     * 请求成功
     * @param data
     */
    void requestSuccess(T data);

    /**
     * 请求失败
     * @param error
     */
    void requestFial(String error);

    /**
     * 请求完成调用
     */
    void requestComplete();

}
