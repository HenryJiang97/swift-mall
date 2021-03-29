package com.example.swiftmall.service.impl;

import com.example.swiftmall.dao.product.ProductDao;
import com.example.swiftmall.model.product.Product;

import java.util.List;

public class ProductDaoImpl implements ProductDao {

    @Override
    public int insert(Product product) {
        return 0;
    }

    @Override
    public int deleteByAttribute(String attribute, String value) {
        return 0;
    }

    @Override
    public List<Product> getByAttribute(String attribute, String value) {
        return null;
    }

    @Override
    public int updateByAttribute(String attribute, String value, Product product) {
        return 0;
    }
}
