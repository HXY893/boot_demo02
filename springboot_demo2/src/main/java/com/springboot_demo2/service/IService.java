package com.springboot_demo2.service;

import com.alibaba.fastjson.JSONObject;
import com.springboot_demo2.pojo.Order;
import com.springboot_demo2.pojo.User;

import java.util.HashMap;
import java.util.Map;

public interface IService {
    //JSONObject showAll(JSONObject jsonObject);
    public Map<String,Object> showAll(int pageNumber,int pageSize,String searchText);
    //添加用户addorder
    Boolean addOrder(Order order);
    //更新用户updateOrder
    Boolean updateOrder(Order order);
    //删除用户
    Boolean deleteByOrderid(Integer[] ids);
}
