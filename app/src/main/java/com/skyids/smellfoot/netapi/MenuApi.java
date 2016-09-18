package com.skyids.smellfoot.netapi;

import com.skyids.smellfoot.moudle.menu.bean.BaseModel;
import com.skyids.smellfoot.moudle.menu.bean.MenuModel;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者：番茄汤加面 on 2016/9/7 19:52
 * 邮箱：15915786108@163.com
 */
public interface MenuApi {

    String BEAUTY_ID = "0";
    String WEIGHT_LOST_ID = "10";

    //http://apis.baidu.com/tngou/cook/
    @GET("list")
    Observable<BaseModel<MenuModel>> list(@Query("id") String id/*,@Query("page") String page,@Query("rows") String rows*/);


}
