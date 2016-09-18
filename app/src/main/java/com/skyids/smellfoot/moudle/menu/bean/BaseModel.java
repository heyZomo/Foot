package com.skyids.smellfoot.moudle.menu.bean;

import java.util.List;

/**
 * 作者：番茄汤加面 on 2016/9/8 20:02
 * 邮箱：15915786108@163.com
 */
public class BaseModel<T> {

    public String status;

    public int total;

    public List<T> tngou;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getTngou() {
        return tngou;
    }

    public void setTngou(List<T> tngou) {
        this.tngou = tngou;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "status='" + status + '\'' +
                ", total=" + total +
                ", data=" + tngou +
                '}';
    }
}
