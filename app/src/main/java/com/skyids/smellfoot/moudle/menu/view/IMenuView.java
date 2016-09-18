package com.skyids.smellfoot.moudle.menu.view;

import com.skyids.smellfoot.base.IView;
import com.skyids.smellfoot.moudle.menu.bean.MenuModel;

import java.util.List;

/**
 * 作者：番茄汤加面 on 2016/9/7 19:18
 * 邮箱：15915786108@163.com
 */
public interface IMenuView extends IView {

    void showLoadingView();

    void hideLoadingView();

    void onSuccessLoadView(List<MenuModel> datas);

    void onFailLoadView(String error);

}
