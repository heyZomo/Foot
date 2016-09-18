package com.skyids.smellfoot.moudle.menu.presenter;

import com.skyids.smellfoot.base.PresenterImpl;
import com.skyids.smellfoot.moudle.menu.bean.MenuModel;
import com.skyids.smellfoot.moudle.menu.model.IMenuList;
import com.skyids.smellfoot.moudle.menu.model.MenuListImpl;
import com.skyids.smellfoot.moudle.menu.view.IMenuView;

import java.util.List;

/**
 * 作者：番茄汤加面 on 2016/9/7 19:13
 * 邮箱：15915786108@163.com
 */
public class MenuListPresenter extends PresenterImpl<IMenuView,List<MenuModel>> implements IMenuListPresenter {

    private IMenuList<List<MenuModel>> iMenuList;


    public MenuListPresenter(IMenuView menuView ,String url){
        super(menuView);
        iMenuList = new MenuListImpl();
        mSubscription = iMenuList.requestMenuList(this, url);
    }

    @Override
    public void beforeRequest() {
        mView.showLoadingView();
    }

    @Override
    public void requestSuccess(List<MenuModel> data) {
        mView.onSuccessLoadView(data);
    }

    @Override
    public void requestFial(String error) {
        mView.onFailLoadView(error);
    }

    @Override
    public void requestComplete() {
        super.requestComplete();
    }


}
