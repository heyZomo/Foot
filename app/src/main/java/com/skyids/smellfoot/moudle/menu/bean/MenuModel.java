package com.skyids.smellfoot.moudle.menu.bean;

/**
 * 作者：番茄汤加面 on 2016/9/7 19:29
 * 邮箱：15915786108@163.com
 */
public class MenuModel {

    private int count;

    private String description;

    private int fcount;

    private String food;

    private int id;

    private String images;

    private String img;

    private String keywords;

    private String name;

    private int rcount;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuModel{" +
                "count=" + count +
                ", description='" + description + '\'' +
                ", fcount=" + fcount +
                ", food='" + food + '\'' +
                ", id=" + id +
                ", images='" + images + '\'' +
                ", img='" + img + '\'' +
                ", keywords='" + keywords + '\'' +
                ", name='" + name + '\'' +
                ", rcount=" + rcount +
                '}';
    }

}
