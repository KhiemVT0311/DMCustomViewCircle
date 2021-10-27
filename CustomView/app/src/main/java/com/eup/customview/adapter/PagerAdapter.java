package com.eup.customview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eup.customview.R;

public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    private Context mContext;

    public PagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.pager, container, false);

        if (position == 0) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color0));
        } else if (position == 1) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color1));
        } else if (position == 2) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color2));
        } else if (position == 3) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color3));
        } else if (position == 4) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color4));
        }

        container.addView(layout);
        return layout;
    }
}
