package com.example.uitest.views;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.uitest.R;
import com.example.uitest.adapters.CustomFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization code
        final TabLayout tabLayout = findViewById(R.id.tabs);
        final ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager( ViewPager viewPager ) {
        CustomFragmentPagerAdapter adapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

}
