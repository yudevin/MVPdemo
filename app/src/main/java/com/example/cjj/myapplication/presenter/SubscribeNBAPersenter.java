package com.example.cjj.myapplication.presenter;

import com.example.cjj.myapplication.Contract.SubscribeNBAContract;

/**
 * Created by cjj on 2017/6/19.
 */

public class SubscribeNBAPersenter  implements SubscribeNBAContract.Persenter {
    private final SubscribeNBAContract.View mDetailView;
    public SubscribeNBAPersenter(SubscribeNBAContract.View view){
        mDetailView = view;
        mDetailView.setPresenter(this);
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
}
