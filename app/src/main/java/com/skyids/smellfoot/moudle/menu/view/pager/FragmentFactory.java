package com.skyids.smellfoot.moudle.menu.view.pager;


import com.skyids.smellfoot.base.BaseFragment;

public class FragmentFactory {

    public static BaseFragment getFragment(int position) {
        BaseFragment fragment = null;
        String loadId = "1";
        switch (position) {
            case 0:
                loadId = "1";
                break;
            case 1:
                loadId = "10";
                break;
            case 2:
                loadId = "15";
                break;
            case 3:
                loadId = "52";
                break;
            case 4:
                loadId = "62";
                break;
            case 5:
                loadId = "68";
                break;
            case 6:
                loadId = "75";
                break;
            case 7:
                loadId = "82";
                break;
            case 8:
                loadId = "98";
                break;
        }
        fragment = new BeautyFragment(loadId);
        return fragment;
    }

}
