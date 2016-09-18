package com.skyids.smellfoot.moudle.menu.view.pager;

import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.skyids.smellfoot.R;
import com.skyids.smellfoot.base.BaseFragment;
import com.skyids.smellfoot.moudle.menu.adapter.MenuAdapter;
import com.skyids.smellfoot.moudle.menu.bean.MenuModel;
import com.skyids.smellfoot.moudle.menu.presenter.MenuListPresenter;
import com.skyids.smellfoot.moudle.menu.view.IMenuView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：番茄汤加面 on 2016/9/8 08:08
 * 邮箱：15915786108@163.com
 */
public class BeautyFragment<IMenuListPresenter> extends BaseFragment  implements IMenuView {

    public BeautyFragment(){};

    public BeautyFragment(String id){
        super(id);
    }

    private MenuAdapter adapter = new MenuAdapter();

    @Bind(R.id.menu_fresh)
    SwipeRefreshLayout refreshLayout;

    @Bind(R.id.menu_rcy)
    RecyclerView recyclerView;



    @Override
    protected View onInitView() {
        View view = View.inflate(getContext(), R.layout.fgm_menu_pager,null);
        ButterKnife.bind(view);
        refreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.menu_fresh);
        recyclerView = (RecyclerView) view.findViewById(R.id.menu_rcy);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        recyclerView.setAdapter(adapter);
        refreshLayout.setColorSchemeColors(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
        refreshLayout.setEnabled(false);

        mPresenter = new MenuListPresenter(this,loadId);

        return view;
    }


    @Override
    public void showLoadingView() {
        refreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoadingView() {
        refreshLayout.setRefreshing(false);
    }

    @Override
    public void onSuccessLoadView(List<MenuModel> datas) {
        adapter.setImages(datas);
    }

    @Override
    public void onFailLoadView(String error) {
        System.out.println(error);
    }

    @Override
    public void initView() {

    }
}
