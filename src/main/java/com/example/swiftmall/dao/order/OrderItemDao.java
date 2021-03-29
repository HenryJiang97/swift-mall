package com.example.swiftmall.dao.order;

import com.example.swiftmall.model.order.OrderItem;

import java.util.List;

public interface OrderItemDao {

    int insert(OrderItem product);

    int deleteByAttribute(String attribute, String value);

    List<OrderItem> getByAttribute(String attribute, String value);

    int updateByAttribute(String attribute, String value, OrderItem product);
}
