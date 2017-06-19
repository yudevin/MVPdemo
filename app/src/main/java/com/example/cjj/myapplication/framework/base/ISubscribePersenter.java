package com.example.cjj.myapplication.framework.base;

/**
 * Created by cjj on 2017/6/19.
 */

public interface ISubscribePersenter extends BasePersenter{
    void onSubscribe();
    void cancelSubscribe();
}
