package com.example.cjj.myapplication.Common.api;

import com.example.cjj.myapplication.data.bean.net.BaseResponse;
import com.example.cjj.myapplication.data.bean.net.ListResponse;

import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by yxm on 2017/6/21.
 */

public interface ApiService {
    public static final String BASE_URL = "http://www.taobao.com";

    @POST("/subscriber")
    Observable<BaseResponse<String>>  getSubscriber();

    @POST("/subscriberlist")
    Observable<ListResponse<String>>  getSubscriberList();
}
