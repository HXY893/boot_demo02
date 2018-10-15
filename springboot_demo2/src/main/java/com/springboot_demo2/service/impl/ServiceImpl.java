package com.springboot_demo2.service.impl;

import com.github.pagehelper.PageHelper;
import com.springboot_demo2.mapper.UserMapper;
import com.springboot_demo2.pojo.Order;
import com.springboot_demo2.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceImpl implements IService {
    @Autowired
    private UserMapper userMapper;
    //分页查询所有用户
    @Override
    public Map<String, Object> showAll(int pageNumber, int pageSize,String searchText) {
        int total = userMapper.selectCount();
        Map<String,Object> jo=new HashMap<>();
        pageNumber=pageNumber-1;
        jo.put("pageNumber", pageNumber);
        jo.put("pageSize", pageSize);
        jo.put("searchText",searchText);
        System.out.println(jo);
        //PageHelper.startPage(pageNumber,pageSize);
        List<Order> rows = userMapper.selectAllByHelper(jo);
        Map<String,Object> result= new HashMap<>();
        result.put("total",total);
        result.put("rows",rows);
        return result;
    }
    //添加用户
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public Boolean addOrder(Order order) {
        return userMapper.addOrder(order);
    }
    //更新用户信息
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public Boolean updateOrder(Order order) {
        return userMapper.updateOrder(order);
    }
    //删除用户信息
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public Boolean deleteByOrderid(Integer[] ids) {
        return userMapper.deleteByOrderid(ids);
    }
//    @Override
//    public JSONObject showAll(JSONObject jsonObject) {
//        JSONObject jo=new JSONObject();
//        List<User> userList = userMapper.selectAll(jsonObject);
//        int num = userMapper.selectTotal(jsonObject);
//        jo.put("total",num);
//        jo.put("rows",userList);
//        return jo;


}
