package com.lywhxy.mapper;

import com.lywhxy.pojo.Order;
import com.lywhxy.pojo.User;

import java.util.List;

public interface OrderMapper {
    List<Order> selectOrderList();

    List<Order> selectOrderList2();

}
