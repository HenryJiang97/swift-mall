package com.example.swiftmall.service.impl;

import com.example.swiftmall.dao.product.CategoryDao;
import com.example.swiftmall.model.product.Category;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public int insert(Category product) {
        return 0;
    }

    @Override
    public int deleteByAttribute(String attribute, String value) {
        return 0;
    }

    @Override
    public List<Category> getByAttribute(String attribute, String value) {
        return null;
    }

    @Override
    public int updateByAttribute(String attribute, String value, Category product) {
        return 0;
    }
}
