package com.skyids.smellfoot.moudle.menu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.skyids.smellfoot.R;
import com.skyids.smellfoot.moudle.menu.bean.MenuModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * 作者：番茄汤加面 on 2016/9/7 18:59
 * 邮箱：15915786108@163.com
 */
public class MenuAdapter extends RecyclerView.Adapter {

    List<MenuModel> images;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_foot_introduce, parent, false);
        return new DebounceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DebounceViewHolder debounceViewHolder = (DebounceViewHolder) holder;

        ((DebounceViewHolder) holder).itemRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("click.....");
            }
        });

        MenuModel tngou = images.get(position);
        debounceViewHolder.tvIntroduce.setText(tngou.getName());
        debounceViewHolder.tvDescription.setText(tngou.getDescription());
        String base = "http://tnfs.tngou.net/img";
        Glide.with(holder.itemView.getContext()).load(base + tngou.getImg()).into(debounceViewHolder.ivShow);
    }

    @Override
    public int getItemCount() {
        if (images == null) {
            return 0;
        }
        return images.size();
    }

    class DebounceViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.menu_item_root)
        LinearLayout itemRoot;

        @Bind(R.id.tv_foot_introduce)
        TextView tvIntroduce;

        @Bind(R.id.iv_foot_show)
        ImageView ivShow;

        @Bind(R.id.tv_foot_description)
        TextView tvDescription;


        public DebounceViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            //            itemRoot = (LinearLayout) itemView.findViewById(R.id.menu_item_root);
            //            ivShow = (ImageView) itemView.findViewById(R.id.iv_foot_show);
            //            tvIntroduce = (TextView) itemView.findViewById(R.id.tv_foot_introduce);
            //            tvDescription = (TextView) itemView.findViewById(R.id.tv_foot_description);
        }
    }


    public void setImages(List<MenuModel> images) {
        this.images = images;
        notifyDataSetChanged();
    }

}
