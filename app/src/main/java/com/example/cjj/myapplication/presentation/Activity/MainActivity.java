package com.example.cjj.myapplication.presentation.Activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.cjj.myapplication.Common.ActivityUtil;
import com.example.cjj.myapplication.R;
import com.example.cjj.myapplication.presentation.Fragment.MainFragment;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment mainFragment = (MainFragment) getFragmentManager().findFragmentById(R.id.content);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            ActivityUtil.addFragmentToActivity(getFragmentManager(),
                    mainFragment, R.id.content);
        }
    }


}
