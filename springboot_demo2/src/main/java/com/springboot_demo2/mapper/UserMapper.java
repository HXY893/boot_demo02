package com.springboot_demo2.mapper;

import com.springboot_demo2.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
//    List<User> selectAll(JSONObject jsonObject);
//    int selectTotal(JSONObject jsonObject);
    //查询总信息集合
    List<Order> selectAllByHelper(Map jo);
    //查询一共条数
    int selectCount();
    //添加用户addorder
    Boolean addOrder(Order order);
    //更新用户updateOrder
    Boolean updateOrder(Order order);
    //删除用户
    Boolean deleteByOrderid(Integer[] ids);

}
