package com.springboot_demo2;


import com.springboot_demo2.mapper.UserMapper;
import com.springboot_demo2.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper dao;
    @Test
    public void testSelectAllByHelper(){
        Map<String,Object> jo=new HashMap<>();
        jo.put("pageNumber",1);
        jo.put("pageSize",5);
        jo.put("searchText","Palme");
        List<Order> orders = dao.selectAllByHelper(jo);
        System.out.println("++++++++++++++++++++++++++"+orders.size());
    }
}
