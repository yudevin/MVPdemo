package com.example.cjj.myapplication.presentation.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.cjj.myapplication.Contract.SubscribeNBAContract;
import com.example.cjj.myapplication.presenter.SubscribeNBAPersenter;

import static android.support.v4.util.Preconditions.checkNotNull;

/**
 * Created by yxm on 2017/6/19.
 */

public class MainFragment extends Fragment implements SubscribeNBAContract.View{
    SubscribeNBAContract.Persenter mPresenter;

    public static MainFragment newInstance() {
        Bundle arguments = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(arguments);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(mPresenter == null){
            setPresenter(new SubscribeNBAPersenter(context,this));
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.loadData();
    }

    @Override
    public void onSuccessSubscribe() {

    }

    @Override
    public void onFailSubscribe() {

    }

    @Override
    public void setPresenter(SubscribeNBAContract.Persenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    public void loadingView() {

    }

    @Override
    public void dismissloading() {

    }

    @Override
    public void setTitleView(String title) {

    }
}
