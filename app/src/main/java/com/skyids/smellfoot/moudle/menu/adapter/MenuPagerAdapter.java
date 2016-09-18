package com.skyids.smellfoot.moudle.menu.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.skyids.smellfoot.moudle.menu.view.pager.FragmentFactory;

/**
 * 作者：番茄汤加面 on 2016/9/8 07:59
 * 邮箱：15915786108@163.com
 */
public class MenuPagerAdapter extends FragmentPagerAdapter {


    private final String[] TITLES = {"美容", "减肥", "保健养生", "人群", "时节"
            , "餐时", "器官", "调养", "肠胃消化"};

    public MenuPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        return FragmentFactory.getFragment(position);
    }

}
