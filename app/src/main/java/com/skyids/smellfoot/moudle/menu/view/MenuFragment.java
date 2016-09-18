package com.skyids.smellfoot.moudle.menu.view;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.skyids.smellfoot.R;
import com.skyids.smellfoot.base.BaseFragment;
import com.skyids.smellfoot.moudle.menu.adapter.MenuPagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：番茄汤加面 on 2016/9/7 18:59
 * 邮箱：15915786108@163.com
 */
public class MenuFragment extends BaseFragment {


    private View mMenuView;

    @Bind(R.id.menu_pager_tabs)
    PagerSlidingTabStrip mPagersTab;

    @Bind(R.id.menu_pager)
    ViewPager mPager;

    private MenuPagerAdapter mMenuPagerAdapter;

    @Override
    protected View onInitView() {
        mMenuView = View.inflate(getContext(), R.layout.frg_menu,null);
        mMenuPagerAdapter = new MenuPagerAdapter(mActivity.getSupportFragmentManager());
        ButterKnife.bind(mMenuView);
        mPagersTab = (PagerSlidingTabStrip) mMenuView.findViewById(R.id.menu_pager_tabs);
        mPager = (ViewPager) mMenuView.findViewById(R.id.menu_pager);
        mPager.setAdapter(mMenuPagerAdapter);
        mPagersTab.setViewPager(mPager);
        return mMenuView;
    }


}
