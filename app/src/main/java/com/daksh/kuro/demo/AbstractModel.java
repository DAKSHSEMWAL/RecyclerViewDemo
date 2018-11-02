package com.daksh.kuro.demo;

import java.util.ArrayList;

public class AbstractModel {

    private String packagename;
    private String price;
    private int packicon;
    private String desc;

    public AbstractModel(String packagename, String price, int packicon, String desc) {
        this.packagename = packagename;
        this.price = price;
        this.packicon = packicon;
        this.desc = desc;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPackicon() {
        return packicon;
    }

    public void setPackicon(int packicon) {
        this.packicon = packicon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
