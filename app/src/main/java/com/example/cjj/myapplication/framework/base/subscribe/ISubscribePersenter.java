package com.example.cjj.myapplication.framework.base.subscribe;

import com.example.cjj.myapplication.framework.base.BasePersenter;

/**
 * Created by yxm on 2017/6/19.
 */

public interface ISubscribePersenter extends BasePersenter {
    void onSubscribe();
    void cancelSubscribe();
}
