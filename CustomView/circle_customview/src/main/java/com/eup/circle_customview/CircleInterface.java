package com.eup.circle_customview;

import androidx.viewpager.widget.ViewPager;

public interface CircleInterface {
    void setViewPager(ViewPager viewPager) throws PagesLessException;

    void setAnimateDuration(long duration);

    void setRadiusSelected(int radius);

    void setRadiusUnselected(int radius);

    void setDistanceDot(int distance);

}
