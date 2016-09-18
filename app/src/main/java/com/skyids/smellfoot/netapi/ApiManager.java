package com.skyids.smellfoot.netapi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * 作者：番茄汤加面 on 2016/9/7 19:49
 * 邮箱：15915786108@163.com
 */
public class ApiManager {

    private static final String BASE_URL = "http://apis.baidu.com/tngou/cook/";
    private static OkHttpClient okHttpClient = addheaderOkHttpClient();
    private static GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();

    private static RxJavaCallAdapterFactory rxJavaCallAdapterFactory = RxJavaCallAdapterFactory.create();

    private static MenuApi menuApi;

    /**
     * 统一添加apikey header
     * @return
     */
    private static OkHttpClient addheaderOkHttpClient(){
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("apikey", "82b7299b49dc1164ec211399904b5b2b")
                                .build();
                        return chain.proceed(request);
                    }

                })
                .build();

        return httpClient;
    }


    /**
     * 菜单API
     * @return
     */
    public static MenuApi getMenuApi(){
        if (menuApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient).baseUrl(BASE_URL)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(gsonConverterFactory)
                    .build();
            menuApi = retrofit.create(MenuApi.class);
        }
        return menuApi;
    }



}
