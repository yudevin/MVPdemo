package com.example.cjj.myapplication.Contract;

import com.example.cjj.myapplication.framework.base.ISubscribePersenter;
import com.example.cjj.myapplication.framework.base.ISubscribeView;

/**
 * Created by yxm on 2017/6/19.
 */

public interface SubscribeNBAContract extends SubscribeContract {
    interface View extends ISubscribeView<SubscribeNBAContract.Persenter> {
        void  loadingView();
        void  dismissloading();
        void  setTitleView(String title);

     }
    interface Persenter extends ISubscribePersenter {
         void loadData();
    }
}
