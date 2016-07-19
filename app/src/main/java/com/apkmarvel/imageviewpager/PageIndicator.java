package com.apkmarvel.imageviewpager;

import android.graphics.Color;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by johncarlofranco.com on 7/19/2016.
 */
public class PageIndicator {
    private TextView[] dots;
    private LinearLayout dotsLayout;
    public PageIndicator(int size,LinearLayout dotsLayout){
        this.dotsLayout=dotsLayout;
        dots = new TextView[size];
        addBottomDots(0);
    }
    public void addBottomDots(int currentPage) {
        int colorsActive = Color.parseColor("#f98da5");
        int colorsInactive = Color.parseColor("#93c6fd");
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(dotsLayout.getContext());
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive);
            dotsLayout.addView(dots[i]);
        }
        if (dots.length > 0)dots[currentPage].setTextColor(colorsActive);
    }
}
