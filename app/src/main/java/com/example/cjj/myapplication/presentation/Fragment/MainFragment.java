package com.example.cjj.myapplication.presentation.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

import com.example.cjj.myapplication.Contract.SubscribeNBAContract;

import static android.support.v4.util.Preconditions.checkNotNull;

/**
 * Created by cjj on 2017/6/19.
 */

public class MainFragment extends Fragment implements SubscribeNBAContract.View{
    SubscribeNBAContract.Persenter mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    public static MainFragment newInstance() {
        Bundle arguments = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(arguments);
        return fragment;
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
}
