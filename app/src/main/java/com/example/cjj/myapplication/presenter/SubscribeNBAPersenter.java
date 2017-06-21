package com.example.cjj.myapplication.presenter;

import android.content.Context;

import com.example.cjj.myapplication.Common.api.ApiServiceImpl;
import com.example.cjj.myapplication.Contract.SubscribeNBAContract;
import com.example.cjj.myapplication.data.bean.net.BaseResponse;

import java.lang.ref.WeakReference;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by yxm on 2017/6/19.
 */

public class SubscribeNBAPersenter  implements SubscribeNBAContract.Persenter {
    private final SubscribeNBAContract.View mDetailView;
    private WeakReference<Context> mContext;
    public SubscribeNBAPersenter(Context context,SubscribeNBAContract.View view){
        mDetailView = view;
        mDetailView.setPresenter(this);
        mContext = new WeakReference<>(context);
    }
    @Override
    public void onSubscribe() {

    }

    @Override
    public void cancelSubscribe() {

    }

    @Override
    public void start() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void loadData() {
        Context context = mContext.get();
        if(context != null){
            mDetailView.loadingView();
            ApiServiceImpl.getInstance(context)
                          .getSubscriber()
                          .subscribeOn(Schedulers.io())
                          .observeOn(AndroidSchedulers.mainThread())
                          .subscribe(new Action1<BaseResponse<String>>() {
                              @Override
                              public void call(BaseResponse<String> baseResponse) {
                                  if(baseResponse.getCode() == 200){
                                      mDetailView.setTitleView(baseResponse.getData());
                                  }
                                  mDetailView.dismissloading();
                              }
                          });
        }
    }
}
