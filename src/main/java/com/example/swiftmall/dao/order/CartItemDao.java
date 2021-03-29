package com.example.swiftmall.dao.order;

import com.example.swiftmall.model.order.CartItem;

import java.util.List;

public interface CartItemDao {

    int insert(CartItem product);

    int deleteByAttribute(String attribute, String value);

    List<CartItem> getByAttribute(String attribute, String value);

    int updateByAttribute(String attribute, String value, CartItem product);
}
