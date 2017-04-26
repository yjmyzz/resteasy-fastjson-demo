package com.cnblogs.yjmyzz;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    String name;
    int qty;


    @JSONField(format = "yyyy年MM月dd日")
    Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", createTime=" + createTime +
                '}';
    }


}