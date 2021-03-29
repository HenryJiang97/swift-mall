package com.example.swiftmall.service.impl;

import com.example.swiftmall.dao.order.OrderItemDao;
import com.example.swiftmall.model.order.OrderItem;

import java.util.List;

public class OrderItemDaoImpl implements OrderItemDao {

    @Override
    public int insert(OrderItem product) {
        return 0;
    }

    @Override
    public int deleteByAttribute(String attribute, String value) {
        return 0;
    }

    @Override
    public List<OrderItem> getByAttribute(String attribute, String value) {
        return null;
    }

    @Override
    public int updateByAttribute(String attribute, String value, OrderItem product) {
        return 0;
    }
}
