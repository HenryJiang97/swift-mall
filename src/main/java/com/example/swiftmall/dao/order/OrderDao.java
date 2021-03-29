package com.example.swiftmall.dao.order;

import com.example.swiftmall.model.order.Order;

import java.util.List;

public interface OrderDao {

    int insert(Order order);

    int deleteByAttribute(String attribute, String value);

    int updateByAttribute(String attribute, String value, Order order);

    List<Order> getByAttribute(String attribute, String value);

}
