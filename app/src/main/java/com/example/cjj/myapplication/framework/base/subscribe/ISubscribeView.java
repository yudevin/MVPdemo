package com.example.cjj.myapplication.framework.base.subscribe;

import com.example.cjj.myapplication.framework.base.BaseView;

/**
 * Created by yxm on 2017/6/19.
 */

public interface ISubscribeView<T> extends BaseView<T> {
     void  onSuccessSubscribe();
     void  onFailSubscribe();
}
