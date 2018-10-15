package com.springboot_demo2.web;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.springboot_demo2.pojo.Order;
import com.springboot_demo2.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private IService service;
    @RequestMapping("/")
    public String index(Model model){
        //model.addAttribute("name","hxtdfg");

        return "page";
    }
    //主界面,及分页
    @RequestMapping(value = "/index",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object index(int pageNumber,int pageSize,String searchText){

        //System.out.println(pageNumber);
        System.out.println(searchText);
        Map<String, Object> all = service.showAll(pageNumber, pageSize,searchText);
        System.out.println(all);
        return all;
    }
    //添加数据
    @RequestMapping(value = "/addOrder",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Boolean addorder(Order order){
        System.out.println(order.toString());
        Boolean aBoolean = service.addOrder(order);
        System.out.println(aBoolean);
        return service.addOrder(order);
    }
    //更新用户updateOrder
    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Boolean updateorder(Order order){
        return service.updateOrder(order);
    }
    //删除信息
    @RequestMapping(value = "/deleteByOrderid",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Boolean del(Integer[] ids){
        Boolean dels = service.deleteByOrderid(ids);
        System.out.println(dels);
        return dels;
    }

}
//    @RequestMapping(value = "/user",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
//    @ResponseBody
//    public Object indexpage(@RequestBody JSONObject jsonObject){
//        System.out.println(jsonObject);
//        JSONObject users = service.showAll(jsonObject);
//        return users;
//    }