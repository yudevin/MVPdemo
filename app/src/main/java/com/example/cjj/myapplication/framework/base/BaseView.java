package com.example.cjj.myapplication.framework.base;

/**
 * Created by yxm on 2017/6/19.
 */

public interface BaseView<T> {
    /** 让View持有Presenter，这样可以让View在合适的时机（View初始化完成）来调用Presenter中的方法加载数据 */
    void setPresenter(T presenter);

}
