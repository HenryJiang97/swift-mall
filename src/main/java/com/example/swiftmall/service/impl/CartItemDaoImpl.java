package com.example.swiftmall.service.impl;

import com.example.swiftmall.dao.order.CartItemDao;
import com.example.swiftmall.model.order.CartItem;

import java.util.List;

public class CartItemDaoImpl implements CartItemDao {

    @Override
    public int insert(CartItem product) {
        return 0;
    }

    @Override
    public int deleteByAttribute(String attribute, String value) {
        return 0;
    }

    @Override
    public List<CartItem> getByAttribute(String attribute, String value) {
        return null;
    }

    @Override
    public int updateByAttribute(String attribute, String value, CartItem product) {
        return 0;
    }
}
