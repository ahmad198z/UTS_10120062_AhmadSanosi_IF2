package com.ahmad.memo10120062;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import android.view.View;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    //10120062_Ahmad Sanosi_IF2

        ViewPager2 viewPager2;
        ArrayList<ViewPagerItem10120062> viewPagerItemArrayList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            viewPager2 = findViewById(R.id.viewpager);
            int[] images = {R.drawable.ahmadsanosi,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
            String[] heading = {"Ahmad Sanosi","Grilled","Dessert","Italian","Shakes"};
            String[] desc = {getString(R.string.a_desc),
                    getString(R.string.b_desc),
                    getString(R.string.c_desc),
                    getString(R.string.d_desc)
                    ,getString(R.string.e_desc)};

            viewPagerItemArrayList = new ArrayList<>();

            for (int i =0; i< images.length ; i++){

                ViewPagerItem10120062 viewPagerItem = new ViewPagerItem10120062(images[i],heading[i],desc[i]);
                viewPagerItemArrayList.add(viewPagerItem);

            }

            VPAdapter10120062 vpAdapter = new VPAdapter10120062(viewPagerItemArrayList);

            viewPager2.setAdapter(vpAdapter);

            viewPager2.setClipToPadding(false);

            viewPager2.setClipChildren(false);

            viewPager2.setOffscreenPageLimit(2);

            viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        }
    }