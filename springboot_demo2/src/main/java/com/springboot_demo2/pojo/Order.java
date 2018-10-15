package com.springboot_demo2.pojo;

public class Order {
    private Integer orderid;
    private String ordertime;
    private String orderprice;
    private String orderuser;
    private String orderdescribe;

    public Order() {

    }
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(String orderprice) {
        this.orderprice = orderprice;
    }

    public String getOrderuser() {
        return orderuser;
    }

    public void setOrderuser(String orderuser) {
        this.orderuser = orderuser;
    }

    public String getOrderdescribe() {
        return orderdescribe;
    }

    public void setOrderdescribe(String orderdescribe) {
        this.orderdescribe = orderdescribe;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", ordertime='" + ordertime + '\'' +
                ", orderprice='" + orderprice + '\'' +
                ", orderuser='" + orderuser + '\'' +
                ", orderdescribe='" + orderdescribe + '\'' +
                '}';
    }
}
