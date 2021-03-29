package com.example.swiftmall.service.impl;

import com.example.swiftmall.dao.order.OrderDao;
import com.example.swiftmall.model.order.Order;

import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public int insert(Order order) {
        return 0;
    }

    @Override
    public int deleteByAttribute(String attribute, String value) {
        return 0;
    }

    @Override
    public int updateByAttribute(String attribute, String value, Order order) {
        return 0;
    }

    @Override
    public List<Order> getByAttribute(String attribute, String value) {
        return null;
    }
}
