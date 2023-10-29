package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewPager);


        MenuPagerAdapter pagerAdapter = new MenuPagerAdapter(getSupportFragmentManager());


        viewPager.setAdapter((PagerAdapter) pagerAdapter);


        TabLayout tabLayout = findViewById(R.id.tabLayout);


        tabLayout.setupWithViewPager(viewPager);
    }
}







