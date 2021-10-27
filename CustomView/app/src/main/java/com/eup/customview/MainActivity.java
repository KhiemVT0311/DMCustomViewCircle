package com.eup.customview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.eup.circle_customview.CircleView;
import com.eup.circle_customview.PagesLessException;
import com.eup.customview.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    CircleView circleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        circleView = (CircleView) findViewById(R.id.indicator);
        PagerAdapter adapter = new PagerAdapter(this);
        viewPager.setAdapter(adapter);
        try {
            circleView.setViewPager(viewPager);
        } catch (PagesLessException e) {
            e.printStackTrace();
        }

    }
}