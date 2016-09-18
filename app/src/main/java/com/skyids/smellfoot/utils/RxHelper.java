package com.skyids.smellfoot.utils;

import com.skyids.smellfoot.moudle.menu.bean.BaseModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * 作者：番茄汤加面 on 2016/9/10 11:32
 * 邮箱：15915786108@163.com
 */
public class RxHelper {

    /**
     * 返回数据预处理
     * @param <T>
     * @return
     */
    public static <T> Observable.Transformer<BaseModel<T>,List<T>> handleResult(){

        return new Observable.Transformer<BaseModel<T>, List<T>>() {
            @Override
            public Observable<List<T>> call(Observable<BaseModel<T>> baseModelObservable) {

                return baseModelObservable.flatMap(new Func1<BaseModel<T>,Observable<List<T>>>(){

                    @Override
                    public Observable<List<T>> call(BaseModel<T> tBaseModel) {
                        String status = tBaseModel.getStatus();
                        if("true".equalsIgnoreCase(status)){
                            return resultData(tBaseModel.getTngou());
                        }
                        return Observable.error(new ServerException("server error"));
                    }
                }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }


    /**
     * 返回数据
     * @param data
     * @param <T>
     * @return
     */
    private static <T> Observable<List<T>> resultData(final List<T> data){
        return Observable.create(new Observable.OnSubscribe<List<T>>() {
            @Override
            public void call(Subscriber subscriber) {
                try{
                    subscriber.onNext(data);
                    subscriber.onCompleted();
                }catch (Exception e){
                    subscriber.onError(e);
                }
            }
        });
    }

}
