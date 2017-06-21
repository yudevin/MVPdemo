package com.example.cjj.myapplication.Common.api;

import android.content.Context;

import com.example.cjj.myapplication.data.bean.net.BaseResponse;
import com.example.cjj.myapplication.data.bean.net.ListResponse;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by yxm on 2017/6/21.
 */

public class ApiServiceImpl {
    private static final int DEFAULT_TIMEOUT = 20;

    private ApiService apiService;

    private OkHttpClient okHttpClient;

    public static String baseUrl = ApiService.BASE_URL;
    private static ApiServiceImpl mInstance = null;

    private static Context mContext;
     private ApiServiceImpl(Context context) {
         mContext = context.getApplicationContext();

         okHttpClient = new OkHttpClient.Builder()
                 .addNetworkInterceptor(
                         new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS))
//                 .addInterceptor(new BaseInterceptor(new HashMap<String, String>()))
                 .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                 .build();
         Retrofit retrofit = new Retrofit.Builder()
                 .client(okHttpClient)
                 .addConverterFactory(GsonConverterFactory.create())
                 .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                 .baseUrl(baseUrl)
                 .build();
         apiService = retrofit.create(ApiService.class);
     }
    public synchronized  static ApiServiceImpl getInstance(Context context){
         if(mInstance == null){
             mInstance = new ApiServiceImpl(context);
         }
        return mInstance;
    }

    public Observable<BaseResponse<String>> getSubscriber(){
        return apiService.getSubscriber();
    }
    public Observable<ListResponse<String>> getSubscriberList(){
        return apiService.getSubscriberList();
    }

}
