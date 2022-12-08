package com.wolfsoft.financeapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import adapter.View_Pager_Adapter;
import me.relex.circleindicator.CircleIndicator;

public class Login_01 extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private View_Pager_Adapter view_pager_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_01);



        //        view pager and circleindicator code is here:

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        circleIndicator = (CircleIndicator) findViewById(R.id.circleindicator);
        view_pager_adapter = new View_Pager_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(view_pager_adapter);
        circleIndicator.setViewPager(viewPager);
        view_pager_adapter.registerDataSetObserver(circleIndicator.getDataSetObserver());





    }
}
